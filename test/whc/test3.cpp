#include "libWh.h"

void F1(std::stack<bin_tree::bin_tree_ptr> * f_stack); // incr
void M(std::stack<bin_tree::bin_tree_ptr> * f_stack); // main

int main(int argc, char *argv[]) {
	return libWh::run(argc, argv);
}

// Function : incr
void F1(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
V1 = bin_tree::nil();
V0 = bin_tree::cons(V1, I0);
f_stack->push(V0);
I0 = f_stack->top();
f_stack->pop();
f_stack->push(I0);
}


// Function : main
void M(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
f_stack->push(I0);
V0 = f_stack->top();
f_stack->pop();
L0 :
if(V0->isFalse()) { goto L1; }
f_stack->push(I0);
V1 = f_stack->top();
f_stack->pop();
L2 :
if(V1->isFalse()) { goto L3; }
f_stack->push(I0);
F1(f_stack);
V2 = f_stack->top();
f_stack->pop();
f_stack->push(V2);
I0 = f_stack->top();
f_stack->pop();
V1 = bin_tree::tl(V1);
goto L2;
L3 :
V0 = bin_tree::tl(V0);
goto L0;
L1 :
f_stack->push(I0);
}


