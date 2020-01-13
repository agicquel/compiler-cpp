#include <iostream>
#include "bin_tree.h"
#include <string>
#include <stack>

//bin_tree * greater(bin_tree *I0, bin_tree *I1);
bin_tree * isOne(bin_tree *I0);
bin_tree * isZero(bin_tree *I0);
bin_tree * greater(bin_tree *I0, bin_tree *I1);

bin_tree * greater2(bin_tree *I0, bin_tree *I1) {
    if(bin_tree::equals(I0, I1)) {
        return bin_tree::getFalse();
    }
    else {

        //std::cout << "I0 avant boucle : " << I0->toString() << std::endl;
        //std::cout << "I1 avant boucle  : " << I1->toString() << std::endl;

        while(!bin_tree::equals(I0, bin_tree::nil()) && !bin_tree::equals(I1, bin_tree::nil()) )
        {
            I0 = bin_tree::tl(I0);
            I1 = bin_tree::tl(I1);
        }

        //std::cout << "I0 apres boucle : " << I0->toString() << std::endl;
        //std::cout << "I1 apres boucle  : " << I1->toString() << std::endl;

        if(bin_tree::equals(I0, bin_tree::nil())) {
            return bin_tree::getFalse();
        }
        else {
            return bin_tree::getTrue();
        }
    }
}

int main() {
    std::cout << "=== MAIN ===" << std::endl;
    bin_tree *t1 = new bin_tree( "t1");
    bin_tree *t2 = new bin_tree("t1");
    bin_tree *t3 = bin_tree::cons(t1, t2);
    bin_tree *t4 = bin_tree::cons(bin_tree::nil(), t3);

    bin_tree *r1 = greater(t4, t1);
    std::cout << "r1 ? " << (r1->isTrue() ? "V" : "F") << std::endl;
    bin_tree *r2 = greater(t4, t4);
    std::cout << "r2 ? " << (r2->isTrue() ? "V" : "F") << std::endl;
    bin_tree *r3 = greater(t1, t4);
    std::cout << "r3 ? " << (r3->isTrue() ? "V" : "F") << std::endl;

    /*std::cout << "isZero t5 ? " << (isZero(t5)->isTrue() ? "V" : "F") << std::endl;
    std::cout << "isZero t6 ? " << (isZero(t6)->isTrue() ? "V" : "F") << std::endl;
    std::cout << "isZero t7 ? " << (isZero(t7)->isTrue() ? "V" : "F") << std::endl;
    std::cout << "isZero t1 ? " << (isZero(t1)->isTrue() ? "V" : "F") << std::endl;*/

    //std::cout << "t1 = " + t1->toString() << std::endl;
    //std::cout << "t2 = " + t2->toString() << std::endl;
    //std::cout << "t1 == t2 ? " << (bin_tree::equals(t1, t2) ? "V" : "F") << std::endl;
    //std::cout << "t7 ? " << (t7->isTrue() ? "V" : "F") << std::endl;
    //std::cout << "t8 ? " << (t8->isTrue() ? "V" : "F") << std::endl;
    //std::cout << "t3 = " + t3->toString() << std::endl;
    //std::cout << "t4 = " + t4->toString() << std::endl;
    return 0;
}

bin_tree * greater(bin_tree *I0, bin_tree *I1)
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
    bin_tree *V9 = new bin_tree();
    bin_tree *V10 = new bin_tree();
    bin_tree *V11 = new bin_tree();
    bin_tree *V12 = new bin_tree();
    bin_tree *V13 = new bin_tree();
    bin_tree *V14 = new bin_tree();
    bin_tree *V15 = new bin_tree();
    bin_tree *V16 = new bin_tree();
    bin_tree *V17 = new bin_tree();
    bin_tree *V18 = new bin_tree();
    bin_tree *V19 = new bin_tree();
    bin_tree *V20 = new bin_tree();
    bin_tree *V21 = new bin_tree();
    bin_tree *V22 = new bin_tree();
    bin_tree *V23 = new bin_tree();

    if(bin_tree::equals(I0, I1)) { goto L7; }
    V1 = bin_tree::getFalse();
    goto L6;
    L7 :
    V1 = bin_tree::getTrue();
    L6 :
    if(V1->isTrue()) { goto L3; }
    goto L4;
    L3 :
    V0 = bin_tree::getTrue();
    goto L5;
    L4 :
    V0 = bin_tree::getFalse();
    L5 :
    L0 :
    V2 = bin_tree::nil();
    f_stack.push(V2);
    V3 = f_stack.top();
    f_stack.pop();
    goto L2;
    L1 :
    L10 :
    V8 = bin_tree::nil();
    if(bin_tree::equals(I0, V8)) { goto L25; }
    V9 = bin_tree::getFalse();
    goto L24;
    L25 :
    V9 = bin_tree::getTrue();
    L24 :
    if(V9->isTrue()) { goto L21; }
    goto L22;
    L21 :
    V7 = bin_tree::getTrue();
    goto L23;
    L22 :
    V7 = bin_tree::getFalse();
    L23 :
    L20 :
    if(V7->isTrue()) { goto L26; }
    V7 = bin_tree::getTrue();
    goto L27;
    L26 :
    V7 = bin_tree::getFalse();
    L27 :
    if(V7->isTrue()) { goto L17; }
    goto L18;
    L17 :
    V6 = bin_tree::getTrue();
    goto L19;
    L18 :
    V6 = bin_tree::getFalse();
    L19 :
    L16 :
    if(V6->isTrue()) { goto L13; }
    goto L14;
    L13 :
    V5 = bin_tree::getTrue();
    goto L15;
    L14 :
    V5 = bin_tree::getFalse();
    L15 :
    if(V5->isFalse()) { goto L12; }
    V13 = bin_tree::nil();
    if(bin_tree::equals(I1, V13)) { goto L40; }
    V14 = bin_tree::getFalse();
    goto L39;
    L40 :
    V14 = bin_tree::getTrue();
    L39 :
    if(V14->isTrue()) { goto L36; }
    goto L37;
    L36 :
    V12 = bin_tree::getTrue();
    goto L38;
    L37 :
    V12 = bin_tree::getFalse();
    L38 :
    L35 :
    if(V12->isTrue()) { goto L41; }
    V12 = bin_tree::getTrue();
    goto L42;
    L41 :
    V12 = bin_tree::getFalse();
    L42 :
    if(V12->isTrue()) { goto L32; }
    goto L33;
    L32 :
    V11 = bin_tree::getTrue();
    goto L34;
    L33 :
    V11 = bin_tree::getFalse();
    L34 :
    L31 :
    if(V11->isTrue()) { goto L28; }
    goto L29;
    L28 :
    V10 = bin_tree::getTrue();
    goto L30;
    L29 :
    V10 = bin_tree::getFalse();
    L30 :
    if(V10->isFalse()) { goto L12; }
    L11 :
    V4 = bin_tree::getTrue();
    goto L9;
    L12 :
    V4 = bin_tree::getFalse();
    goto L8;
    L9 :
    V15 = bin_tree::tl(I0);
    f_stack.push(V15);
    I0 = f_stack.top();
    f_stack.pop();
    V16 = bin_tree::tl(I1);
    f_stack.push(V16);
    I1 = f_stack.top();
    f_stack.pop();
    goto L10;
    L8 :
    V18 = bin_tree::nil();
    if(bin_tree::equals(I0, V18)) { goto L50; }
    V19 = bin_tree::getFalse();
    goto L49;
    L50 :
    V19 = bin_tree::getTrue();
    L49 :
    if(V19->isTrue()) { goto L46; }
    goto L47;
    L46 :
    V17 = bin_tree::getTrue();
    goto L48;
    L47 :
    V17 = bin_tree::getFalse();
    L48 :
    L43 :
    V20 = bin_tree::nil();
    f_stack.push(V20);
    V3 = f_stack.top();
    f_stack.pop();
    goto L45;
    L44 :
    V21 = bin_tree::nil();
    V22 = bin_tree::nil();
    V23 = bin_tree::cons(V21, V22);
    f_stack.push(V23);
    V3 = f_stack.top();
    f_stack.pop();
    L45 :
    L2 :

    return V3;
}