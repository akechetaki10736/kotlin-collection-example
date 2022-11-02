val languages = mapOf(
    "Kotlin" to 2011,
    "Java" to 1995,
    "C++" to 1980,
)

languages.filterValues { it <= 2000 }