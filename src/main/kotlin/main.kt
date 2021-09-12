fun main() {
    val amount: Int = 10_000

    if (amount >= 3_500) {
        val commission = amount / 100 * 0.75
        println("Комиссия составит $commission копеек")
    } else println("Недостаточно средств для перевода!")
}