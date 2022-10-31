val names = mutableListOf(
    listOf("Simon", "Bruce"),
    listOf("John", "Tom","Mary")
)
println(names)

names.minusElement(listOf("Simon", "Bruce"))

println(names)

names.minus(listOf("Simon", "Bruce"))
println(names)