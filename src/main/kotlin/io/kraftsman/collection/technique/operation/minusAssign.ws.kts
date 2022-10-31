val names = mutableListOf("John", "Tom", "Mary")

names.minusAssign("Tom")
println(names)

names -= "John"
println(names)

names.remove("Mary")
println(names)