val listOfNames = listOf("Tom", "John", "Allen", "Sean")

listOfNames.getOrElse(1) { "Unknown Person" }
listOfNames.getOrElse(100) {
    if(it > 50) "Out of range" else "Unknown Person"
}