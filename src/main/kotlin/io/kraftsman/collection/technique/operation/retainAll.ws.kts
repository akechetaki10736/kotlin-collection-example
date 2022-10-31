val names = mutableListOf("John", "Tom", "Mary")

names.retainAll { it.contains('o') }
println(names)