//
// Created by agicquel on 07/01/2020.
//

#ifndef LIBWH_BIN_TREE_NODE_H
#define LIBWH_BIN_TREE_NODE_H

#ifndef NIL
#define NIL "nil"
#endif


#include <string>

class bin_tree_node {
public:
    bin_tree_node *parent;
    bin_tree_node *head;
    bin_tree_node *tail;
    std::string node_key;

    bin_tree_node();
    bin_tree_node(std::string key);
    ~bin_tree_node();
};


#endif //LIBWH_BIN_TREE_NODE_H
