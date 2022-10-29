val setOfNames = setOf("Tom", "John", "Allen", "Sean")

setOfNames.elementAtOrElse(1) { "Unknown Person" }

setOfNames.elementAtOrElse(100) {
    if(it > 50) "Out of range" else "Unknown Person"
}