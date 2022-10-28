Iterable {
    iterator {
        yield(2)
        yield(4)
        yieldAll(1..5 step 2)
    }
}.joinToString(",")