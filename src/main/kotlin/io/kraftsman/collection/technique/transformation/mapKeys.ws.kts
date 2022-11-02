import kotlin.random.Random

data class Customer(
    val name: String,
    val age: Int
)

val customers = mapOf(
    1 to Customer("Sue", 23),
    2 to Customer("Mary", 27),
    3 to Customer("Peter", 37),
)

customers.mapKeys { it.value.name }
customers.mapKeys { Random.nextInt(it.key + 10) }
customers.mapKeys { (_, customer) ->
    customer.name
}