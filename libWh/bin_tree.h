//
// Created by agicquel on 04/01/2020.
//

#ifndef LIBWH_BIN_TREE_H
#define LIBWH_BIN_TREE_H


#include <string>

class bin_tree
{
private:
    std::string value;
    bin_tree *head;
    bin_tree *tail;

public:
    bin_tree();
    bin_tree(std::string value);
    ~bin_tree();

    bool isTrue();
    bool isFalse();
    std::string getValue();

    bin_tree * cons(bin_tree *t1, bin_tree *t2);
    bin_tree * list(bin_tree *t1, bin_tree *t2);
    bin_tree * hd(bin_tree *t1);
    bin_tree * tl(bin_tree *t1);

    static bin_tree * getTrue();
    static bin_tree * getFalse();
    static bool equals(bin_tree *t1, bin_tree *t2);
    static bin_tree * nil();
};


#endif //LIBWH_BIN_TREE_H
