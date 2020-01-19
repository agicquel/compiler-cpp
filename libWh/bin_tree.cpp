//
// Created by agicquel on 04/01/2020.
//

#include "bin_tree.h"

#include <utility>
#include <iostream>
#include <memory>

bin_tree::bin_tree() {
    head = tail = nullptr;
    node_key = NIL;
}

bin_tree::bin_tree(std::string root_value) {
    head = tail = nullptr;
    node_key = root_value;
}

bin_tree::~bin_tree() {
    //delete this->head;
    //delete this->tail;
    std::cout << "destrucor called" << std::endl;
    //safeDeleteRec();
}

bool bin_tree::isTrue() {
    return head != nullptr && tail != nullptr;
}

bool bin_tree::isFalse() {
    return !isTrue();
}

bin_tree * bin_tree::cons(bin_tree * tree1, bin_tree * tree2) {
    auto * tree = new bin_tree();
    //std::shared_ptr<bin_tree> tree(new bin_tree());
    tree->head = std::shared_ptr<bin_tree>(tree1);
    tree->tail = std::shared_ptr<bin_tree>(tree2);
    //tree->tail = tree2;
    return tree;
}

bin_tree * bin_tree::hd(const bin_tree * tree) {
    if(tree->head != nullptr) return tree->head.get();
    else return nil();
}

bin_tree * bin_tree::tl(const bin_tree * tree) {
    if(tree->tail != nullptr) return tree->tail.get();
    else return nil();
}

bin_tree * bin_tree::getTrue() {
    return cons(nil(), nil());
}

bin_tree * bin_tree::getFalse() {
    return nil();
}

bool bin_tree::equals(bin_tree *t1, bin_tree *t2) {
    if((t1 == nullptr && t2 != nullptr) || (t1 != nullptr && t2 == nullptr)) {
        return false;
    }
    return t1->toString() == t2->toString();
}

bin_tree * bin_tree::nil() {
    return new bin_tree(NIL);
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

void bin_tree::safeDeleteRec() {
    if(head != nullptr) {
        head->safeDeleteRec();
        //delete head;
    }
    if(tail != nullptr) {
        tail->safeDeleteRec();
        //delete tail;
    }
}

/*bin_tree::bin_tree(bin_tree const& tree) {
    this->tail = tree.tail;
    this->head = tree.head;
    this->node_key = tree.node_key;
}*/

