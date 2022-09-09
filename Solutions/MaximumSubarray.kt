fun main() {
    maxSubArray(intArrayOf(5, 4, -1, 7, 8))
}

fun maxSubArray(nums: IntArray): Int {

    if (nums.size == 1) {
        return nums[0]
    }
    if (nums.max()!! < 0) {
        return nums.max()!!
    }

    var first = true
    var sum = 0
    var max = 0

    for (item in nums) {
        if (first && item >= 1) {
            sum += item
            first = false
        } else if (!first) {
            sum += item
        }
        if (sum > max) {
            max = sum
        }
        if (sum <= 0) {
            sum = 0
            first = true
        }
    }
    return max
}