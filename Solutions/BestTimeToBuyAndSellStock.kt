fun main() {
    val result = maxProfit(intArrayOf(7, 5, 1))
    print(result)
}

fun maxProfit(prices: IntArray): Int {
    var last = Integer.MAX_VALUE
    var highest = 0
    for (i in 0 until prices.size) {
        if (prices[i] < last)
            last = prices[i]

        val profit = prices[i] - last
        if (highest < profit)
            highest = profit
    }
    return highest
}