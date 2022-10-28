import kotlin.coroutines.ContinuationInterceptor

linkedMapOf(
    "Apple" to 100,
    "Banana" to 12,
    "Orange" to 60
)

val linkedMap = linkedMapOf(
    Pair("Apple", 100),
    Pair("Banana", 12),
    Pair("Orange", 60)
)

linkedMap.keys.forEach { key ->
    println(linkedMap[key])
}

linkedMap.forEach { (t, u) ->
    println("Key: $t, Value: $u")
}