data class Product(
    val sku: String,
    val name: String,
    val price: Double
)

val products = listOf(
    Product("FT-0851", "Banana", 10.0),
    Product("FT-0422", "Watermelon", 150.0),
    Product("FT-0342", "Apple", 80.0),
    Product("FT-0982", "Grapes", 200.0),
    Product("FT-0952", "Orange", 60.0),
)

products.sortedBy { it.price }
    .binarySearchBy(80.0) {
        it.price
    }