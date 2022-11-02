val languages = mapOf(
    "Kotlin" to 2011,
    "Java" to 1995,
    "C++" to 1980,
)

languages.filterKeys { it != "C++" }

