#include <iostream>
#include "bin_tree.h"
#include "code_test.h"
#include <string>
#include <stack>
#include <unistd.h>
#include <boost/regex.hpp>
#include <boost/xpressive/xpressive.hpp>

using namespace boost::xpressive;
using namespace regex_constants;


struct output_nested_results
{
    int tabs_;

    output_nested_results( int tabs = 0 )
            : tabs_( tabs )
    {
    }

    template< typename BidiIterT >
    void operator ()( match_results< BidiIterT > const &what ) const
    {
        // first, do some indenting
        typedef typename std::iterator_traits< BidiIterT >::value_type char_type;
        char_type space_ch = char_type(' ');
        std::fill_n( std::ostream_iterator<char_type>( std::cout ), tabs_ * 4, space_ch );

        // output the match
        std::cout << what[0] << '\n';

        // output any nested matches
        std::for_each(
                what.nested_results().begin(),
                what.nested_results().end(),
                output_nested_results( tabs_ + 1 ) );
    }
};


bool is_number(const std::string& s)
{
    std::string::const_iterator it = s.begin();
    while (it != s.end() && std::isdigit(*it)) ++it;
    return !s.empty() && it == s.end();
}

int main(int argc, char *argv[]) {
    std::cout << "=== MAIN ===" << std::endl;

    auto * m_stack = new std::stack<bin_tree::bin_tree_ptr>;
    char output_format = 'd';

    // DOC : https://www.boost.org/doc/libs/1_61_0/libs/xpressive/doc/html/boost_xpressive/user_s_guide/grammars_and_nested_matches.html
    // TODO : faire une analyse synthaxique rexucursive pour lire les paramètres et creer les arbres binaires
    sregex reg;
    reg
            = '('                            // is an opening parenthesis ...
            >>                           // followed by ...
            *(                          // zero or more ...
                    keep( +~(set='(',')') )  // of a bunch of things that are not parentheses ...
                    |                          // or ...
                    by_ref(reg)      // a balanced set of parentheses
            )                          //   (ooh, recursion!) ...
            >>                           // followed by ...
            ')'                            // a closing parenthesis
            ;

    if(argc == 1 || argc % 2 == 0) {
        std::cout << "Invalid parameters" << std::endl;
        return EXIT_FAILURE;
    }

    // reverse argv for the stack
    char **argvr = new char*[argc];
    for(int i = 1; i < argc; i+=2) {
        argvr[i] = argv[argc-i-1];
        argvr[i+1] = argv[argc-i];
    }

    int opt = 0;
    while((opt = getopt(argc, argvr, ":i:o:")) != -1) {
        switch(opt) {
            case 'i':
                if(is_number(optarg)) {
                    bin_tree::bin_tree_ptr t = bin_tree::createInt(atoi(optarg));
                    m_stack->push(t);
                }
                else {
                    smatch m;
                    std::string s = optarg;
                    regex_search(s, m, reg);
                    std::cout << "size nested = " << m.nested_results().size() << std::endl;

                    std::for_each(
                            m.nested_results().begin(),
                            m.nested_results().end(),
                            output_nested_results() );

                }
                break;
            case 'o':
                output_format = optarg[0];
                break;
            case ':':
                std::cout << "Parameter value is missing." << std::endl;
                return EXIT_FAILURE;
            default:
                std::cout << "Invalid option : " << opt << std::endl;
                return EXIT_FAILURE;
        }
    }

    if(m_stack->empty()) {
        m_stack->push(bin_tree::nil());
        m_stack->push(bin_tree::nil());
    }

    M(m_stack);

    bin_tree::bin_tree_ptr res;
    switch(output_format) {
        case 's':
            std::cout << "Result (str) :" << std::endl;
            while(!m_stack->empty()) {
                res = m_stack->top();
                m_stack->pop();
                std::cout << res->toString() << std::endl;
            }
            break;
        case 'd':
        default:
            std::cout << "Result (int) :";
            while(!m_stack->empty()) {
                res = m_stack->top();
                m_stack->pop();
                std::cout << " " << res->toInt();
            }
            std::cout << std::endl;
            break;
    }

    delete m_stack;
    return EXIT_SUCCESS;
}
