file(REMOVE_RECURSE
  "libWhile.a"
  "libWhile.pdb"
)

# Per-language clean rules from dependency scanning.
foreach(lang )
  include(CMakeFiles/While.dir/cmake_clean_${lang}.cmake OPTIONAL)
endforeach()
