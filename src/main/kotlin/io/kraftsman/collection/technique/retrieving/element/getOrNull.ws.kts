val listOfNames = listOf("Tom", "John", "Allen", "Sean")

listOfNames.getOrNull(1)

listOfNames.getOrNull(10)

listOfNames.getOrNull(10) ?: "Unknown Person"