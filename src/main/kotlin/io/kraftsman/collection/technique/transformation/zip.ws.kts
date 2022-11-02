val animals = listOf("fox", "bear", "wolf")
val onlyTwoAnimals = listOf("fox", "bear")
val colors = listOf("red", "brown", "gray")

animals.zip(colors)
onlyTwoAnimals.zip(colors) // 以小集合為主，多的捨棄

animals.zip(colors) { animal, color ->
    "The $animal is $color"
}

animals.zip(colors)
    .map { (animal, color) ->
        "The $animal is $color"
    }