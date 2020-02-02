#include "libWh.h"

void F8(std::stack<bin_tree::bin_tree_ptr> * f_stack); // add
void F7(std::stack<bin_tree::bin_tree_ptr> * f_stack); // isOne
void F6(std::stack<bin_tree::bin_tree_ptr> * f_stack); // mult
void F13(std::stack<bin_tree::bin_tree_ptr> * f_stack); // fact
void F1(std::stack<bin_tree::bin_tree_ptr> * f_stack); // isNotZero
void F3(std::stack<bin_tree::bin_tree_ptr> * f_stack); // incr
void F9(std::stack<bin_tree::bin_tree_ptr> * f_stack); // subs
void F14(std::stack<bin_tree::bin_tree_ptr> * f_stack); // gcd
void M(std::stack<bin_tree::bin_tree_ptr> * f_stack); // main
void F12(std::stack<bin_tree::bin_tree_ptr> * f_stack); // div
void F2(std::stack<bin_tree::bin_tree_ptr> * f_stack); // isZero
void F10(std::stack<bin_tree::bin_tree_ptr> * f_stack); // pow
void F5(std::stack<bin_tree::bin_tree_ptr> * f_stack); // addR
void F11(std::stack<bin_tree::bin_tree_ptr> * f_stack); // greater
void F4(std::stack<bin_tree::bin_tree_ptr> * f_stack); // decr
void F15(std::stack<bin_tree::bin_tree_ptr> * f_stack); // fib

int main(int argc, char *argv[]) {
	return libWh::run(argc, argv);
}

// Function : add
void F8(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr I1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
I1 = f_stack->top();
f_stack->pop();
f_stack->push(I0);
V0 = f_stack->top();
f_stack->pop();
f_stack->push(I1);
V1 = f_stack->top();
f_stack->pop();
L0 :
if(V1->isFalse()) { goto L1; }
f_stack->push(V0);
F3(f_stack);
V2 = f_stack->top();
f_stack->pop();
f_stack->push(V2);
V0 = f_stack->top();
f_stack->pop();
V1 = bin_tree::tl(V1);
goto L0;
L1 :
f_stack->push(V0);
}


// Function : isOne
void F7(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V4 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V5 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V6 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V7 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V8 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V9 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V10 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
V3 = bin_tree::nil();
V4 = bin_tree::nil();
V2 = bin_tree::cons(V3, V4);
if(bin_tree::equals(I0,V2)) { goto L9; }
V5 = bin_tree::getFalse();
goto L8;
L9 :
V5 = bin_tree::getTrue();
L8 :
if(V5->isTrue()) { goto L5; }
goto L6;
L5 :
V1 = bin_tree::getTrue();
goto L7;
L6 :
V1 = bin_tree::getFalse();
L7 :
if(V1->isFalse()) { goto L4; }
L3 :
V0 = bin_tree::getTrue();
goto L0;
L4 :
V0 = bin_tree::getFalse();
goto L1;
L0 :
V7 = bin_tree::nil();
V8 = bin_tree::nil();
V6 = bin_tree::cons(V7, V8);
f_stack->push(V6);
V9 = f_stack->top();
f_stack->pop();
goto L2;
L1 :
V10 = bin_tree::nil();
f_stack->push(V10);
V9 = f_stack->top();
f_stack->pop();
L2 :
f_stack->push(V9);
}


// Function : mult
void F6(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr I1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
I1 = f_stack->top();
f_stack->pop();
V0 = bin_tree::nil();
f_stack->push(V0);
V1 = f_stack->top();
f_stack->pop();
f_stack->push(I1);
V2 = f_stack->top();
f_stack->pop();
L0 :
if(V2->isFalse()) { goto L1; }
f_stack->push(V1);
f_stack->push(I0);
F8(f_stack);
V3 = f_stack->top();
f_stack->pop();
f_stack->push(V3);
V1 = f_stack->top();
f_stack->pop();
V2 = bin_tree::tl(V2);
goto L0;
L1 :
f_stack->push(V1);
}


// Function : fact
void F13(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V4 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V5 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V6 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V7 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V8 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
V1 = bin_tree::nil();
V2 = bin_tree::nil();
V0 = bin_tree::cons(V1, V2);
f_stack->push(V0);
V3 = f_stack->top();
f_stack->pop();
L2 :
f_stack->push(I0);
F1(f_stack);
V6 = f_stack->top();
f_stack->pop();
if(V6->isTrue()) { goto L5; }
goto L6;
L5 :
V5 = bin_tree::getTrue();
goto L7;
L6 :
V5 = bin_tree::getFalse();
L7 :
if(V5->isFalse()) { goto L4; }
L3 :
V4 = bin_tree::getTrue();
goto L1;
L4 :
V4 = bin_tree::getFalse();
goto L0;
L1 :
f_stack->push(I0);
F4(f_stack);
V7 = f_stack->top();
f_stack->pop();
f_stack->push(V7);
f_stack->push(I0);
f_stack->push(V3);
F6(f_stack);
V8 = f_stack->top();
f_stack->pop();
f_stack->push(V8);
V3 = f_stack->top();
f_stack->pop();
I0 = f_stack->top();
f_stack->pop();
goto L2;
L0 :
f_stack->push(V3);
}


// Function : isNotZero
void F1(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
bin_tree::nop();
f_stack->push(I0);
}


// Function : incr
void F3(std::stack<bin_tree::bin_tree_ptr> * f_stack)
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


// Function : subs
void F9(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr I1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
I1 = f_stack->top();
f_stack->pop();
f_stack->push(I0);
V0 = f_stack->top();
f_stack->pop();
f_stack->push(I1);
V1 = f_stack->top();
f_stack->pop();
L0 :
if(V1->isFalse()) { goto L1; }
f_stack->push(V0);
F4(f_stack);
V2 = f_stack->top();
f_stack->pop();
f_stack->push(V2);
V0 = f_stack->top();
f_stack->pop();
V1 = bin_tree::tl(V1);
goto L0;
L1 :
f_stack->push(V0);
}


// Function : gcd
void F14(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr I1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V4 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V5 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V6 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V7 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
I1 = f_stack->top();
f_stack->pop();
f_stack->push(I1);
f_stack->push(I0);
F12(f_stack);
V0 = f_stack->top();
f_stack->pop();
f_stack->push(V0);
V1 = f_stack->top();
f_stack->pop();
f_stack->push(V5);
F1(f_stack);
V4 = f_stack->top();
f_stack->pop();
if(V4->isTrue()) { goto L5; }
goto L6;
L5 :
V3 = bin_tree::getTrue();
goto L7;
L6 :
V3 = bin_tree::getFalse();
L7 :
if(V3->isFalse()) { goto L4; }
L3 :
V2 = bin_tree::getTrue();
goto L0;
L4 :
V2 = bin_tree::getFalse();
goto L1;
L0 :
f_stack->push(V5);
f_stack->push(I1);
F14(f_stack);
V6 = f_stack->top();
f_stack->pop();
f_stack->push(V6);
V7 = f_stack->top();
f_stack->pop();
goto L2;
L1 :
f_stack->push(I1);
V7 = f_stack->top();
f_stack->pop();
L2 :
f_stack->push(V7);
}


// Function : main
void M(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr I1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
I1 = f_stack->top();
f_stack->pop();
f_stack->push(I1);
f_stack->push(I0);
F10(f_stack);
V0 = f_stack->top();
f_stack->pop();
f_stack->push(V0);
V1 = f_stack->top();
f_stack->pop();
f_stack->push(V1);
}


// Function : div
void F12(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr I1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V4 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V5 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V6 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V7 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V8 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V9 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V10 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V11 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V12 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V13 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V14 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
I1 = f_stack->top();
f_stack->pop();
V0 = bin_tree::nil();
f_stack->push(V0);
f_stack->push(I0);
V2 = f_stack->top();
f_stack->pop();
V1 = f_stack->top();
f_stack->pop();
L2 :
f_stack->push(I1);
f_stack->push(V2);
F11(f_stack);
V8 = f_stack->top();
f_stack->pop();
if(V8->isTrue()) { goto L13; }
if(bin_tree::equals(V2,I1)) { goto L25; }
V12 = bin_tree::getFalse();
goto L24;
L25 :
V12 = bin_tree::getTrue();
L24 :
if(V12->isTrue()) { goto L21; }
goto L22;
L21 :
V11 = bin_tree::getTrue();
goto L23;
L22 :
V11 = bin_tree::getFalse();
L23 :
if(V11->isFalse()) { goto L20; }
L19 :
V10 = bin_tree::getTrue();
goto L16;
L20 :
V10 = bin_tree::getFalse();
goto L17;
L16 :
V9 = bin_tree::getTrue();
goto L18;
L17 :
V9 = bin_tree::getFalse();
L18 :
if(V9->isTrue()) { goto L13; }
goto L14;
L13 :
V7 = bin_tree::getTrue();
goto L15;
L14 :
V7 = bin_tree::getFalse();
L15 :
if(V7->isFalse()) { goto L12; }
L11 :
V6 = bin_tree::getTrue();
goto L8;
L12 :
V6 = bin_tree::getFalse();
goto L9;
L8 :
V5 = bin_tree::getTrue();
goto L10;
L9 :
V5 = bin_tree::getFalse();
L10 :
if(V5->isTrue()) { goto L5; }
goto L6;
L5 :
V4 = bin_tree::getTrue();
goto L7;
L6 :
V4 = bin_tree::getFalse();
L7 :
if(V4->isFalse()) { goto L4; }
L3 :
V3 = bin_tree::getTrue();
goto L1;
L4 :
V3 = bin_tree::getFalse();
goto L0;
L1 :
f_stack->push(I1);
f_stack->push(V2);
F9(f_stack);
V13 = f_stack->top();
f_stack->pop();
f_stack->push(V13);
V2 = f_stack->top();
f_stack->pop();
f_stack->push(V1);
F3(f_stack);
V14 = f_stack->top();
f_stack->pop();
f_stack->push(V14);
V1 = f_stack->top();
f_stack->pop();
goto L2;
L0 :
f_stack->push(V1);
f_stack->push(V2);
}


// Function : isZero
void F2(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V4 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V5 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V6 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
if(I0->isTrue()) { goto L5; }
goto L6;
L5 :
V1 = bin_tree::getTrue();
goto L7;
L6 :
V1 = bin_tree::getFalse();
L7 :
if(V1->isFalse()) { goto L4; }
L3 :
V0 = bin_tree::getTrue();
goto L0;
L4 :
V0 = bin_tree::getFalse();
goto L1;
L0 :
V2 = bin_tree::nil();
f_stack->push(V2);
V3 = f_stack->top();
f_stack->pop();
goto L2;
L1 :
V5 = bin_tree::nil();
V6 = bin_tree::nil();
V4 = bin_tree::cons(V5, V6);
f_stack->push(V4);
V3 = f_stack->top();
f_stack->pop();
L2 :
f_stack->push(V3);
}


// Function : pow
void F10(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr I1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V4 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V5 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
I1 = f_stack->top();
f_stack->pop();
V1 = bin_tree::nil();
V2 = bin_tree::nil();
V0 = bin_tree::cons(V1, V2);
f_stack->push(V0);
V3 = f_stack->top();
f_stack->pop();
f_stack->push(I1);
V4 = f_stack->top();
f_stack->pop();
L0 :
if(V4->isFalse()) { goto L1; }
f_stack->push(V3);
f_stack->push(I0);
F6(f_stack);
V5 = f_stack->top();
f_stack->pop();
f_stack->push(V5);
V3 = f_stack->top();
f_stack->pop();
V4 = bin_tree::tl(V4);
goto L0;
L1 :
f_stack->push(V3);
}


// Function : addR
void F5(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr I1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V4 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V5 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V6 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
I1 = f_stack->top();
f_stack->pop();
f_stack->push(I1);
F2(f_stack);
V2 = f_stack->top();
f_stack->pop();
if(V2->isTrue()) { goto L5; }
goto L6;
L5 :
V1 = bin_tree::getTrue();
goto L7;
L6 :
V1 = bin_tree::getFalse();
L7 :
if(V1->isFalse()) { goto L4; }
L3 :
V0 = bin_tree::getTrue();
goto L0;
L4 :
V0 = bin_tree::getFalse();
goto L1;
L0 :
f_stack->push(I0);
V3 = f_stack->top();
f_stack->pop();
goto L2;
L1 :
f_stack->push(I1);
F4(f_stack);
V6 = f_stack->top();
f_stack->pop();
f_stack->push(V6);
f_stack->push(I0);
F5(f_stack);
V5 = f_stack->top();
f_stack->pop();
f_stack->push(V5);
F3(f_stack);
V4 = f_stack->top();
f_stack->pop();
f_stack->push(V4);
V3 = f_stack->top();
f_stack->pop();
L2 :
f_stack->push(V3);
}


// Function : greater
void F11(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr I1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V4 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V5 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V6 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V7 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V8 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V9 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V10 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V11 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V12 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V13 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V14 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V15 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V16 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V17 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V18 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V19 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V20 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V21 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V22 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V23 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V24 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V25 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V26 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V27 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V28 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V29 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V30 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V31 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V32 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V33 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
I1 = f_stack->top();
f_stack->pop();
if(bin_tree::equals(I0,I1)) { goto L9; }
V2 = bin_tree::getFalse();
goto L8;
L9 :
V2 = bin_tree::getTrue();
L8 :
if(V2->isTrue()) { goto L5; }
goto L6;
L5 :
V1 = bin_tree::getTrue();
goto L7;
L6 :
V1 = bin_tree::getFalse();
L7 :
if(V1->isFalse()) { goto L4; }
L3 :
V0 = bin_tree::getTrue();
goto L0;
L4 :
V0 = bin_tree::getFalse();
goto L1;
L0 :
V3 = bin_tree::nil();
f_stack->push(V3);
V4 = f_stack->top();
f_stack->pop();
goto L2;
L1 :
L12 :
V13 = bin_tree::nil();
if(bin_tree::equals(I0,V13)) { goto L35; }
V14 = bin_tree::getFalse();
goto L34;
L35 :
V14 = bin_tree::getTrue();
L34 :
if(V14->isTrue()) { goto L31; }
goto L32;
L31 :
V12 = bin_tree::getTrue();
goto L33;
L32 :
V12 = bin_tree::getFalse();
L33 :
if(V12->isFalse()) { goto L30; }
L29 :
V11 = bin_tree::getTrue();
goto L26;
L30 :
V11 = bin_tree::getFalse();
goto L27;
L26 :
V10 = bin_tree::getTrue();
goto L28;
L27 :
V10 = bin_tree::getFalse();
L28 :
if(V10->isTrue()) { goto L36; }
V10 = bin_tree::getTrue();
goto L37;
L36 :
V10 = bin_tree::getFalse();
L37 :
if(V10->isTrue()) { goto L23; }
goto L24;
L23 :
V9 = bin_tree::getTrue();
goto L25;
L24 :
V9 = bin_tree::getFalse();
L25 :
if(V9->isFalse()) { goto L22; }
L21 :
V8 = bin_tree::getTrue();
goto L18;
L22 :
V8 = bin_tree::getFalse();
goto L19;
L18 :
V7 = bin_tree::getTrue();
goto L20;
L19 :
V7 = bin_tree::getFalse();
L20 :
if(V7->isTrue()) { goto L15; }
goto L16;
L15 :
V6 = bin_tree::getTrue();
goto L17;
L16 :
V6 = bin_tree::getFalse();
L17 :
if(V6->isFalse()) { goto L14; }
V22 = bin_tree::nil();
if(bin_tree::equals(I1,V22)) { goto L58; }
V23 = bin_tree::getFalse();
goto L57;
L58 :
V23 = bin_tree::getTrue();
L57 :
if(V23->isTrue()) { goto L54; }
goto L55;
L54 :
V21 = bin_tree::getTrue();
goto L56;
L55 :
V21 = bin_tree::getFalse();
L56 :
if(V21->isFalse()) { goto L53; }
L52 :
V20 = bin_tree::getTrue();
goto L49;
L53 :
V20 = bin_tree::getFalse();
goto L50;
L49 :
V19 = bin_tree::getTrue();
goto L51;
L50 :
V19 = bin_tree::getFalse();
L51 :
if(V19->isTrue()) { goto L59; }
V19 = bin_tree::getTrue();
goto L60;
L59 :
V19 = bin_tree::getFalse();
L60 :
if(V19->isTrue()) { goto L46; }
goto L47;
L46 :
V18 = bin_tree::getTrue();
goto L48;
L47 :
V18 = bin_tree::getFalse();
L48 :
if(V18->isFalse()) { goto L45; }
L44 :
V17 = bin_tree::getTrue();
goto L41;
L45 :
V17 = bin_tree::getFalse();
goto L42;
L41 :
V16 = bin_tree::getTrue();
goto L43;
L42 :
V16 = bin_tree::getFalse();
L43 :
if(V16->isTrue()) { goto L38; }
goto L39;
L38 :
V15 = bin_tree::getTrue();
goto L40;
L39 :
V15 = bin_tree::getFalse();
L40 :
if(V15->isFalse()) { goto L14; }
L13 :
V5 = bin_tree::getTrue();
goto L11;
L14 :
V5 = bin_tree::getFalse();
goto L10;
L11 :
V24 = bin_tree::tl(I0);
f_stack->push(V24);
I0 = f_stack->top();
f_stack->pop();
V25 = bin_tree::tl(I1);
f_stack->push(V25);
I1 = f_stack->top();
f_stack->pop();
goto L12;
L10 :
V28 = bin_tree::nil();
if(bin_tree::equals(I0,V28)) { goto L70; }
V29 = bin_tree::getFalse();
goto L69;
L70 :
V29 = bin_tree::getTrue();
L69 :
if(V29->isTrue()) { goto L66; }
goto L67;
L66 :
V27 = bin_tree::getTrue();
goto L68;
L67 :
V27 = bin_tree::getFalse();
L68 :
if(V27->isFalse()) { goto L65; }
L64 :
V26 = bin_tree::getTrue();
goto L61;
L65 :
V26 = bin_tree::getFalse();
goto L62;
L61 :
V30 = bin_tree::nil();
f_stack->push(V30);
V4 = f_stack->top();
f_stack->pop();
goto L63;
L62 :
V32 = bin_tree::nil();
V33 = bin_tree::nil();
V31 = bin_tree::cons(V32, V33);
f_stack->push(V31);
V4 = f_stack->top();
f_stack->pop();
L63 :
L2 :
f_stack->push(V4);
}


// Function : decr
void F4(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
V0 = bin_tree::tl(I0);
f_stack->push(V0);
I0 = f_stack->top();
f_stack->pop();
f_stack->push(I0);
}


// Function : fib
void F15(std::stack<bin_tree::bin_tree_ptr> * f_stack)
{
bin_tree::bin_tree_ptr I0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V0 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V1 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V2 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V3 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V4 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V5 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V6 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V7 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V8 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V9 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V10 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V11 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V12 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V13 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V14 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V15 = bin_tree::nil();
bin_tree::bin_tree_ptr	 V16 = bin_tree::nil();

I0 = f_stack->top();
f_stack->pop();
f_stack->push(I0);
F2(f_stack);
V2 = f_stack->top();
f_stack->pop();
if(V2->isTrue()) { goto L5; }
goto L6;
L5 :
V1 = bin_tree::getTrue();
goto L7;
L6 :
V1 = bin_tree::getFalse();
L7 :
if(V1->isFalse()) { goto L4; }
L3 :
V0 = bin_tree::getTrue();
goto L0;
L4 :
V0 = bin_tree::getFalse();
goto L1;
L0 :
V3 = bin_tree::nil();
f_stack->push(V3);
V4 = f_stack->top();
f_stack->pop();
goto L2;
L1 :
f_stack->push(I0);
F7(f_stack);
V7 = f_stack->top();
f_stack->pop();
if(V7->isTrue()) { goto L13; }
goto L14;
L13 :
V6 = bin_tree::getTrue();
goto L15;
L14 :
V6 = bin_tree::getFalse();
L15 :
if(V6->isFalse()) { goto L12; }
L11 :
V5 = bin_tree::getTrue();
goto L8;
L12 :
V5 = bin_tree::getFalse();
goto L9;
L8 :
V9 = bin_tree::nil();
V10 = bin_tree::nil();
V8 = bin_tree::cons(V9, V10);
f_stack->push(V8);
V4 = f_stack->top();
f_stack->pop();
goto L10;
L9 :
f_stack->push(I0);
F4(f_stack);
V13 = f_stack->top();
f_stack->pop();
f_stack->push(V13);
F15(f_stack);
V12 = f_stack->top();
f_stack->pop();
f_stack->push(I0);
F4(f_stack);
V16 = f_stack->top();
f_stack->pop();
f_stack->push(V16);
F4(f_stack);
V15 = f_stack->top();
f_stack->pop();
f_stack->push(V15);
F15(f_stack);
V14 = f_stack->top();
f_stack->pop();
f_stack->push(V14);
f_stack->push(V12);
F8(f_stack);
V11 = f_stack->top();
f_stack->pop();
f_stack->push(V11);
V4 = f_stack->top();
f_stack->pop();
L10 :
L2 :
f_stack->push(V4);
}


