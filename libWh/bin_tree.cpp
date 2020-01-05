//
// Created by agicquel on 04/01/2020.
//

#include "bin_tree.h"

#include <utility>

bin_tree::bin_tree() {
    this->value = "";
}

bin_tree::bin_tree(std::string value) {
    this->value = value;
}

bin_tree::~bin_tree() {
    delete this->head;
    delete this->tail;
}

bool bin_tree::isTrue() {
    return false;
}

bool bin_tree::isFalse() {
    return false;
}

std::string bin_tree::getValue() {
    return this->value;
}

bin_tree *bin_tree::cons(bin_tree *t1, bin_tree *t2) {
    return nullptr;
}

bin_tree *bin_tree::list(bin_tree *t1, bin_tree *t2) {
    return nullptr;
}

bin_tree *bin_tree::hd(bin_tree *t1) {
    return nullptr;
}

bin_tree *bin_tree::tl(bin_tree *t1) {
    return nullptr;
}

bin_tree *bin_tree::getTrue() {
    bin_tree *tree = new bin_tree();
    *tree->head = *bin_tree::nil();
    *tree->tail = *bin_tree::nil();
    return tree;
}

bin_tree *bin_tree::getFalse() {
    return bin_tree::nil();
}

bool bin_tree::equals(bin_tree *t1, bin_tree *t2) {
    return false;
}

bin_tree *bin_tree::nil() {
    return new bin_tree(nullptr);
}

