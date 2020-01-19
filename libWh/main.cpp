#include <iostream>
#include "bin_tree.h"
#include "code_test.h"
#include <string>
#include <stack>
#include <memory>


int main() {
    //bin_tree::bin_tree_ptr p1(new bin_tree("t2"));
    std::cout << "=== MAIN ===" << std::endl;
    /*bin_tree *t1 = new bin_tree("t1");
    bin_tree *t2 = new bin_tree("t2");
    //std::unique_ptr<bin_tree> t1(new bin_tree("t1"));
    //std::unique_ptr<bin_tree> t2(new bin_tree("t2"));
    bin_tree *t3 = bin_tree::cons(t1, t2);
    bin_tree * nil = bin_tree::nil();
    bin_tree *t4 = bin_tree::cons(nil, t3);*/

    /*auto * m_stack = new std::stack<bin_tree*>;
    m_stack->push(bin_tree::nil());
    F2(m_stack);
    std::cout << "size = " << m_stack->size() << std::endl;
*/

    auto * m_stack = new std::stack<bin_tree::bin_tree_ptr>;
    bin_tree::bin_tree_ptr t1 = bin_tree::nil();
    bin_tree::bin_tree_ptr t2 = bin_tree::nil();

    for(int i = 0; i < 30; i++) {
        m_stack->push(t1);
        F2(m_stack);
        t1 = m_stack->top();
        m_stack->pop();
        std::cout << "t1 = " << t1->toInt() << std::endl;
    }

    for(int i = 0; i < 5; i++) {
        m_stack->push(t2);
        F2(m_stack);
        t2 = m_stack->top();
        m_stack->pop();
        std::cout << "t2 = " << t2->toInt() << std::endl;
    }

    std::cout << "\napres func " << std::endl;
    std::cout << "t1 = " << t1->toInt() << std::endl;
    std::cout << "t2 = " << t2->toInt() << std::endl;

    m_stack->push(t2);
    m_stack->push(t1);
    F11(m_stack);

    bin_tree::bin_tree_ptr t3 = m_stack->top();
    bin_tree::bin_tree_ptr t4 = m_stack->top();

    /*for(int i = 0; i < 5; i++) {
        m_stack->push(t3);
        F14(m_stack);
        t3 = m_stack->top();
        m_stack->pop();
        std::cout << "t3 = " << t3->toInt() << std::endl;
    }*/

    //F14(m_stack);
    //m_stack->pop();
    std::cout << "t3 = " << t3->toInt() << std::endl;
    std::cout << "t4 = " << t4->toInt() << std::endl;

    delete m_stack;
    return 0;
}
