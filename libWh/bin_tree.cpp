#include "bin_tree.h"
#include <memory>
#include <iostream>

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

bin_tree::bin_tree_ptr bin_tree::cons(bin_tree_ptr head, bin_tree_ptr tail) {
    bin_tree_ptr tree = std::make_shared<bin_tree>();
    tree->head = head->clone();
    tree->tail = tail->clone();
    return tree;
}

bin_tree::bin_tree_ptr bin_tree::hd(const bin_tree_ptr& tree) {
    if(tree->head.get() != nullptr) return tree->head;
    else return nil();
}

bin_tree::bin_tree_ptr bin_tree::tl(const bin_tree_ptr& tree) {
    if(tree->tail.get() != nullptr) return tree->tail;
    else return nil();
}

bin_tree::bin_tree_ptr bin_tree::getTrue() {
    return cons(nil(), nil());
}

bin_tree::bin_tree_ptr bin_tree::getFalse() {
    return nil();
}

bool bin_tree::equals(const bin_tree_ptr& t1, const bin_tree_ptr& t2) {
    if(t1 == nullptr && t2 == nullptr) return true;
    else if(t1 != nullptr && t2 != nullptr) {
        return t1->node_key == t2->node_key &&
            equals(t1->head, t2->head) &&
            equals(t1->tail, t2->tail);
    }
    else return false;
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

bin_tree::bin_tree_ptr bin_tree::clone() {
    bin_tree_ptr tree = std::make_shared<bin_tree>();
    recCopy(this, tree.get());
    return tree;
}

void bin_tree::recCopy(bin_tree *src, bin_tree *dest) {
    dest->node_key = src->node_key;
    if(src->head != nullptr) {
        dest->head = std::make_shared<bin_tree>();
        recCopy(src->head.get(), dest->head.get());
    }
    if(src->tail != nullptr) {
        dest->tail = std::make_shared<bin_tree>();
        recCopy(src->tail.get(), dest->tail.get());
    }
}

bin_tree::bin_tree_ptr bin_tree::createInt(int size) {
    bin_tree_ptr tree = nil();
    for(int i = 0; i < size; i++) {
        tree = cons(nil(), tree);
    }
    return tree;
}
