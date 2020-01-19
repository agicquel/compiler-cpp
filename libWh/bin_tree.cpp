//
// Created by agicquel on 04/01/2020.
//

#include "bin_tree.h"

#include <memory>

bin_tree::bin_tree() {
    head = tail = nullptr;
    node_key = NIL;
}

bin_tree::bin_tree(std::string root_value) {
    head = tail = nullptr;
    node_key = root_value;
}

bin_tree::~bin_tree() = default;

bool bin_tree::isTrue() {
    return head.get() != nullptr && tail.get() != nullptr;
}

bool bin_tree::isFalse() {
    return !isTrue();
}

bin_tree::bin_tree_ptr bin_tree::cons(bin_tree_ptr tree1, bin_tree_ptr tree2) {
    bin_tree_ptr tree = std::make_shared<bin_tree>();
    tree->head = tree1;
    tree->tail = tree2;
    return tree;
}

bin_tree::bin_tree_ptr bin_tree::hd(bin_tree_ptr tree) {
    if(tree->head.get() != nullptr) return tree->head;
    else return nil();
}

bin_tree::bin_tree_ptr bin_tree::tl(bin_tree_ptr tree) {
    if(tree->tail.get() != nullptr) return tree->tail;
    else return nil();
}

bin_tree::bin_tree_ptr bin_tree::getTrue() {
    return cons(nil(), nil());
}

bin_tree::bin_tree_ptr bin_tree::getFalse() {
    return nil();
}

bool bin_tree::equals(bin_tree_ptr t1, bin_tree_ptr t2) {
    if((t1 == nullptr && t2 != nullptr) || (t1 != nullptr && t2 == nullptr)) {
        return false;
    }
    return t1->toString() == t2->toString();
}

bin_tree::bin_tree_ptr bin_tree::nil() {
    return std::make_shared<bin_tree>(NIL);
}

std::string bin_tree::getValue() {
    return node_key;
}

std::string bin_tree::toString() {
    std::string res = "{\n";
    res += "\tvalue = " + node_key + "\n";
    if(head != nullptr) res += "\thead = " + head->toString() + "\n";
    if(tail != nullptr) res += "\ttail = " + tail->toString() + "\n";
    res += "}\n";
    return res;
}

void bin_tree::nop() {}

int bin_tree::toInt() {
    int size = 0;
    bin_tree *tree = this;
    while(tree->tail != nullptr) {
        size++;
        tree = tree->tail.get();
    }
    return size;
}

// TODO:
bin_tree::bin_tree_ptr bin_tree::clone() {
    return bin_tree::bin_tree_ptr();
}

