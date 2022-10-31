val names = mutableMapOf(
    1 to "John",
    2 to "Tom",
    3 to "Mary",
)

names.putAll(
    mapOf(
        3 to "Simon",
        4 to "Bruce"
    )
)

println(names)