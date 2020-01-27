#ifndef LIBWH__H
#define LIBWH__H

#include <iostream>
#include "bin_tree.h"
#include <string>
#include <stack>
#include <unistd.h>
#include "peglib.h"

void M(std::stack<bin_tree::bin_tree_ptr> * f_stack); // main

namespace libWh {
    bool is_number(const std::string& s)
    {
        std::string::const_iterator it = s.begin();
        while (it != s.end() && std::isdigit(*it)) ++it;
        return !s.empty() && it == s.end();
    }

    bool compareStringIns(const std::string& a, const std::string& b)
    {
        unsigned int sz = a.size();
        if (b.size() != sz)
            return false;
        for (unsigned int i = 0; i < sz; ++i)
            if (tolower(a[i]) != tolower(b[i]))
                return false;
        return true;
    }

    int run(int argc, char *argv[]) {
        auto * m_stack = new std::stack<bin_tree::bin_tree_ptr>;
        char output_format = 'd';

        auto grammar = R"(
            Com     <- '(' ComDef ')'
            ComOp   <- <'cons' / 'list'>
            ComDef  <- ComOp (Exprs)*
            Exprs   <- Var / Com
            Var     <- <([0-9] / [a-z] / [A-Z])+>

            %whitespace  <-  [ \t\r\n]*
        )";
        peg::parser parser;
        parser.load_grammar(grammar);
        std::function<bin_tree::bin_tree_ptr (const peg::Ast&)> eval = [&](const peg::Ast& ast) {
            if(ast.name == "ComDef") {
                const auto& nodes = ast.nodes;
                if(nodes.size() == 1) return bin_tree::nil();
                std::string op = nodes[0]->token;

                bin_tree::bin_tree_ptr tree = eval(*nodes[nodes.size()-1]);
                if(op == "list") {
                    tree = bin_tree::cons(bin_tree::nil(), tree);
                }
                for(int i = nodes.size()-2; i > 0; i--) {
                    tree = bin_tree::cons(eval(*nodes[i]), tree);
                }

                return tree;
            }
            else if(ast.name == "Var") {
                if(compareStringIns(ast.token, "nil"))
                    return bin_tree::nil();
                else
                    return std::make_shared<bin_tree>(ast.token);
            }

            return bin_tree::nil();
        };

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
                        parser.enable_ast();
                        std::shared_ptr<peg::Ast> ast;
                        if (parser.parse(optarg, ast)) {
                            ast = peg::AstOptimizer(true).optimize(ast);
                            bin_tree::bin_tree_ptr tree = eval(*ast);
                            m_stack->push(tree);
                        }
                        else {
                            std::cout << "Expression is incorrect." << std::endl;
                            return EXIT_FAILURE;
                        }
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

        delete[] argvr;

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
}

#endif //LIBWH_H
