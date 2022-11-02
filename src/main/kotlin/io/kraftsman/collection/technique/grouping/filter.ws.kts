val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val warehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

fruits.filter { it.startsWith("P") }

warehouse.filter {
    it.key.contains("n") && it.value >= 10
}

warehouse.filter { (key, value) ->
    key.contains("n") && value >= 10
}

