data class Customer(
    val name: String,
    val age: Int
)

val customers = mapOf(
    1 to Customer("Sue", 23),
    2 to Customer("Mary", 27),
    3 to Customer("Peter", 37),
)

customers.mapValues { it.value.name }
customers.mapValues { (_, customer) ->
    customer.name
}