val numbers = listOf(1, 2, 3, 4, 5)

numbers.windowed(3)

numbers.windowed(
    size = 3,
    step = 2,
    partialWindows = true
)

numbers.windowed(
    size = 3,
    step = 2,
    partialWindows = false
)

numbers.windowed(
    size = 3,
    step = 2,
    partialWindows = false
) { it.sum() }

