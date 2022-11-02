val fruits = listOf(
    "Grape",
    null,
    "Muskmelon",
    null,
    "Kumquat",
    "Pear"
)

fruits.filterNotNull()

fruits.filter { it != null }

val notNullFruits = fruits.filterNotNull()
println(notNullFruits)

val notEqualNullFruits = fruits.filter { it != null }
println(notEqualNullFruits)