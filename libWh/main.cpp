#include <iostream>
#include "bin_tree.h"
#include <string>
#include <stack>


void F2(std::stack<bin_tree> * f_stack);

int main() {
    std::cout << "=== MAIN ===" << std::endl;
    bin_tree t1( "t1");
    bin_tree t2("t2");
    bin_tree t3 = bin_tree::cons(t1, t2);
    bin_tree t4 = bin_tree::cons(bin_tree::nil(), t3);


    auto * m_stack = new std::stack<bin_tree>;
    m_stack->push(bin_tree::nil());
    for(int i = 0; i < 10; i++) {
        //std::cout << "stack size before = " << m_stack->size() << std::endl;
        F2(m_stack);
        //std::cout << "stack size after = " << m_stack->size() << std::endl;
        bin_tree t = m_stack->top();
        m_stack->pop();
        std::cout << "t = " << t.toInt() << std::endl;
        m_stack->push(t);
    }

    return 0;
}

// Function : incr
void F2(std::stack<bin_tree> * f_stack)
{
    bin_tree I0;
    bin_tree V0;
    bin_tree V1;

    I0 = f_stack->top();
    f_stack->pop();
    V0 = bin_tree::nil();
    V1 = bin_tree::cons(V0, I0);
    f_stack->push(V1);
    I0 = f_stack->top();
    f_stack->pop();
    f_stack->push(I0);
}
