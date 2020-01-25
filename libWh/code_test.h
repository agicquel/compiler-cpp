#ifndef LIBWH_CODE_TEST_H
#define LIBWH_CODE_TEST_H

#include <iostream>
#include "bin_tree.h"
#include <string>
#include <stack>
#include <memory>

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


#endif //LIBWH_CODE_TEST_H
