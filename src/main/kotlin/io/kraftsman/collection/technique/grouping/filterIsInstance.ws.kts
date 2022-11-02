abstract class Person(
    open val id: Int,
    open val firstName: String,
    open val lastName: String,
)

data class Student(
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    val email: String,
    val grade: Int,
): Person(id, firstName, lastName)

data class Teacher(
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    val level: Int,
): Person(id, firstName, lastName)

val people = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Student(5, "Sean", "Lin", "sean.lin@gmail.com", 6)
)

people.filterIsInstance<Teacher>()
people.filterIsInstance<Student>()

