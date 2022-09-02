import java.util.*

fun main() {
    val result = twoSum(intArrayOf(3, 2, 4), 6)
    print(Arrays.toString(result))
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            val sum = nums[i] + nums[j]
            if (sum == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}