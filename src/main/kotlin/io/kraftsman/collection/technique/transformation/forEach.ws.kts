val numbers = listOf(1, 3, 5, 7, 9)
val warehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

for (number in numbers) {
    println(number)
}

for (i in numbers.indices) {
    println("$i: ${ numbers[i] }")
}

for ((index, value) in numbers.withIndex()) {
    println("$index: $value")
}

numbers.forEach { println(it) }
numbers.forEach { number -> println(number) }

/*--------------MAP--------------*/

warehouse.forEach {
    println("Key = ${it.key}, Value = ${it.value}")
}

warehouse.forEach { (key, value) ->
    println("Key = ${key}, Value = ${value}")
}

warehouse.forEach { (fruit, amount) ->
    println("Fruit = ${fruit}, Amount = ${amount}")
}