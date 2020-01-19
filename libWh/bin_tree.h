//
// Created by agicquel on 04/01/2020.
//

#ifndef LIBWH_BIN_TREE_H
#define LIBWH_BIN_TREE_H

#ifndef NIL
#define NIL "nil"
#endif

#include <string>
#include <memory>


class bin_tree
{
public:
    typedef std::shared_ptr<bin_tree> bin_tree_ptr;
private:
    //bin_tree *root;
    bin_tree_ptr head;
    bin_tree_ptr tail;
    //bin_tree *tail;
    std::string node_key;
    void safeDeleteRec();

public:

    bin_tree();
    //bin_tree(bin_tree const& tree);
    explicit bin_tree(std::string root_value);
    ~bin_tree();

    std::string getValue();
    bool isTrue();
    bool isFalse();
    int toInt();
    std::string toString();

    static bin_tree * cons(bin_tree * tree1, bin_tree * tree2);
    static bin_tree * hd(const bin_tree * tree);
    static bin_tree * tl(const bin_tree * tree);
    static bin_tree * getTrue();
    static bin_tree * getFalse();
    static bool equals(bin_tree *t1, bin_tree *t2);
    static bin_tree * nil();
    static void nop();
};


#endif //LIBWH_BIN_TREE_H
