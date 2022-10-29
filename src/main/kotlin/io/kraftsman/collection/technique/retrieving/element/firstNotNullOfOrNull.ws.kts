data class Employee(
    val id: Int,
    val name: String,
    val department: String,
    val skills: List<String>? = null
)


val emptyList = emptyList<Employee>()
val nothingInList = listOf<Employee>()


emptyList.firstNotNullOfOrNull { it.skills }
nothingInList.firstNotNullOfOrNull { it.skills }