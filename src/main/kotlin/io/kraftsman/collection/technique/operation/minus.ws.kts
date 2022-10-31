val names = mutableListOf("John", "Tom", "Mary")

names.minus("Tom")
println(names)
names.minus(listOf("Tom", "John"))
println(names)

names - "Mary"