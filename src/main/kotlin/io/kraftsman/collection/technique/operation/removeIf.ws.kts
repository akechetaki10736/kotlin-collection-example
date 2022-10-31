val names = mutableListOf("John", "Tom", "Mary")

names.removeIf { it.contains('o') }

println(names)