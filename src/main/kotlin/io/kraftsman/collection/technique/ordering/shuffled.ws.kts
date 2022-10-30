data class LotteryDrawer(
    val name: String,
)

val raffle = listOf(
    LotteryDrawer("John"),
    LotteryDrawer("Tom"),
    LotteryDrawer("Mary"),
    LotteryDrawer("Sean"),
    LotteryDrawer("Paul"),
)

raffle.shuffled()
raffle.shuffled().first().name
raffle.shuffled().take(3)

