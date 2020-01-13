cmake_minimum_required(VERSION 3.15)
project(libWh)

set(CMAKE_CXX_STANDARD 14)

add_executable(libWh main.cpp bin_tree.cpp bin_tree.h bin_tree_node.cpp bin_tree_node.h)