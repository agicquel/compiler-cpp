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
    bin_tree_ptr head;
    bin_tree_ptr tail;
    std::string node_key;
public:

    bin_tree();
    //bin_tree(bin_tree const& tree);
    explicit bin_tree(std::string root_value);
    ~bin_tree();
    bin_tree_ptr clone();

    std::string getValue();
    bool isTrue();
    bool isFalse();
    int toInt();
    std::string toString();

    static bin_tree_ptr cons(bin_tree_ptr tree1, bin_tree_ptr tree2);
    static bin_tree_ptr hd(bin_tree_ptr tree);
    static bin_tree_ptr tl(bin_tree_ptr tree);
    static bin_tree_ptr getTrue();
    static bin_tree_ptr getFalse();
    static bool equals(bin_tree_ptr t1, bin_tree_ptr t2);
    static bin_tree_ptr nil();
    static void nop();
};


#endif //LIBWH_BIN_TREE_H
