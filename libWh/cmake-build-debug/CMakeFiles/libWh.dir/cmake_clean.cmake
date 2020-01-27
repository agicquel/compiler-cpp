file(REMOVE_RECURSE
  "liblibWh.a"
  "liblibWh.pdb"
)

# Per-language clean rules from dependency scanning.
foreach(lang )
  include(CMakeFiles/libWh.dir/cmake_clean_${lang}.cmake OPTIONAL)
endforeach()
