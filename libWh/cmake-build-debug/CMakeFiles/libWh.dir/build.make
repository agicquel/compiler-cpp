# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.15

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /home/agicquel/.local/share/JetBrains/Toolbox/apps/CLion/ch-0/193.5662.56/bin/cmake/linux/bin/cmake

# The command to remove a file.
RM = /home/agicquel/.local/share/JetBrains/Toolbox/apps/CLion/ch-0/193.5662.56/bin/cmake/linux/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/agicquel/workspace/esir/esir2/comp/libWh

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/agicquel/workspace/esir/esir2/comp/libWh/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/libWh.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/libWh.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/libWh.dir/flags.make

CMakeFiles/libWh.dir/main.cpp.o: CMakeFiles/libWh.dir/flags.make
CMakeFiles/libWh.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/agicquel/workspace/esir/esir2/comp/libWh/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/libWh.dir/main.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/libWh.dir/main.cpp.o -c /home/agicquel/workspace/esir/esir2/comp/libWh/main.cpp

CMakeFiles/libWh.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/libWh.dir/main.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/agicquel/workspace/esir/esir2/comp/libWh/main.cpp > CMakeFiles/libWh.dir/main.cpp.i

CMakeFiles/libWh.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/libWh.dir/main.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/agicquel/workspace/esir/esir2/comp/libWh/main.cpp -o CMakeFiles/libWh.dir/main.cpp.s

CMakeFiles/libWh.dir/bin_tree.cpp.o: CMakeFiles/libWh.dir/flags.make
CMakeFiles/libWh.dir/bin_tree.cpp.o: ../bin_tree.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/agicquel/workspace/esir/esir2/comp/libWh/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/libWh.dir/bin_tree.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/libWh.dir/bin_tree.cpp.o -c /home/agicquel/workspace/esir/esir2/comp/libWh/bin_tree.cpp

CMakeFiles/libWh.dir/bin_tree.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/libWh.dir/bin_tree.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/agicquel/workspace/esir/esir2/comp/libWh/bin_tree.cpp > CMakeFiles/libWh.dir/bin_tree.cpp.i

CMakeFiles/libWh.dir/bin_tree.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/libWh.dir/bin_tree.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/agicquel/workspace/esir/esir2/comp/libWh/bin_tree.cpp -o CMakeFiles/libWh.dir/bin_tree.cpp.s

# Object files for target libWh
libWh_OBJECTS = \
"CMakeFiles/libWh.dir/main.cpp.o" \
"CMakeFiles/libWh.dir/bin_tree.cpp.o"

# External object files for target libWh
libWh_EXTERNAL_OBJECTS =

libWh: CMakeFiles/libWh.dir/main.cpp.o
libWh: CMakeFiles/libWh.dir/bin_tree.cpp.o
libWh: CMakeFiles/libWh.dir/build.make
libWh: CMakeFiles/libWh.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/agicquel/workspace/esir/esir2/comp/libWh/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Linking CXX executable libWh"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/libWh.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/libWh.dir/build: libWh

.PHONY : CMakeFiles/libWh.dir/build

CMakeFiles/libWh.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/libWh.dir/cmake_clean.cmake
.PHONY : CMakeFiles/libWh.dir/clean

CMakeFiles/libWh.dir/depend:
	cd /home/agicquel/workspace/esir/esir2/comp/libWh/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/agicquel/workspace/esir/esir2/comp/libWh /home/agicquel/workspace/esir/esir2/comp/libWh /home/agicquel/workspace/esir/esir2/comp/libWh/cmake-build-debug /home/agicquel/workspace/esir/esir2/comp/libWh/cmake-build-debug /home/agicquel/workspace/esir/esir2/comp/libWh/cmake-build-debug/CMakeFiles/libWh.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/libWh.dir/depend

