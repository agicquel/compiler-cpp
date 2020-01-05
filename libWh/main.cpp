#include <iostream>
#include "bin_tree.h"
#include <string>
#include <stack>

int main() {
    std::cout << "Hello, World!" << std::endl;
    return 0;
}

bin_tree * isOne(bin_tree *I0)
{
    std::stack<bin_tree *> f_stack;
    bin_tree *V0 = new bin_tree();
    bin_tree *V1 = new bin_tree();
    bin_tree *V2 = new bin_tree();
    bin_tree *V3 = new bin_tree();
    bin_tree *V4 = new bin_tree();
    bin_tree *V5 = new bin_tree();
    bin_tree *V6 = new bin_tree();
    bin_tree *V7 = new bin_tree();
    bin_tree *V8 = new bin_tree();

    V0 = bin_tree::nil();
    V1 = bin_tree::nil();
    V2 = V2->cons(V0, V1);
    if(bin_tree::equals(I0, V2)) { goto L4; }
    V3 = bin_tree::getFalse();
    goto L3;
    L4 :
    V3 = bin_tree::getTrue();
    L3 :
    if(V3->isTrue()) { goto L0; }
    goto L1;
    L0 :
    V4 = bin_tree::nil();
    V5 = bin_tree::nil();
    V6 = V6->cons(V4, V5);
    f_stack.push(V6);
    V7 = f_stack.top();
    f_stack.pop();
    goto L2;
    L1 :
    V8 = bin_tree::nil();
    f_stack.push(V8);
    V7 = f_stack.top();
    f_stack.pop();
    L2 :

    return V7;
}