val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val shoppingList = mutableListOf("Apple")
val emptyList = mutableListOf<String>()

fruits.filterTo(shoppingList) {
    it.length > 5
}

fruits.filterTo(shoppingList) {
    it.length > 5
}

shoppingList.add("Banana")
println(shoppingList)

fruits.filterTo(emptyList) {
    it.length > 5
}

val returnList = fruits.filterTo(mutableListOf()) {
    it.length > 5
}

println(returnList)