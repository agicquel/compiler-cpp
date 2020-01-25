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
    static void recCopy(bin_tree *src, bin_tree *dest);
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

    static bin_tree_ptr cons(bin_tree_ptr head, bin_tree_ptr tail);
    static bin_tree_ptr hd(const bin_tree_ptr& tree);
    static bin_tree_ptr tl(const bin_tree_ptr& tree);
    static bin_tree_ptr getTrue();
    static bin_tree_ptr getFalse();
    static bool equals(const bin_tree_ptr& t1, const bin_tree_ptr& t2);
    static bin_tree_ptr nil();
    static bin_tree_ptr createInt(int size);
    static void nop();
};


#endif //LIBWH_BIN_TREE_H
