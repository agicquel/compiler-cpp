cmake_minimum_required(VERSION 3.15)
project(libWh C CXX)

set(CMAKE_CXX_STANDARD 17)
find_package (Threads)

add_library(While STATIC bin_tree.h peglib.h libWh.h)
set_target_properties(While PROPERTIES LINKER_LANGUAGE CXX)
target_link_libraries (While Threads::Threads)

add_executable(main main.cpp)
target_link_libraries (main While)