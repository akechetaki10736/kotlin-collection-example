data class Employee(
    val id: Int,
    val name: String,
    val department: String,
    val skills: List<String>? = null
)

val employees = listOf(
    Employee(1, "Tom", "Backend", listOf("DB", "API")),
    Employee(2, "John", "IT", listOf("Network", "Hardware")),
    Employee(3, "Simon", "Backend"),
    Employee(4, "Mark", "IT"),
    Employee(5, "Tracy", "Design", listOf("Graphic")),
)

val emptyList = emptyList<Employee>()
val nothingInList = listOf<Employee>()

employees.first { it.skills != null }
    .skills

employees.firstOrNull { it.skills != null }
    ?.skills

employees.mapNotNull { it.skills }
    .first()

employees.firstNotNullOf { it.skills }
emptyList.firstNotNullOf { it.skills }
// NoSuchElementException
nothingInList.firstNotNullOf { it.skills }
// NoSuchElementException