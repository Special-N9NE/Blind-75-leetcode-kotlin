fun main() {
    print(maxProduct(intArrayOf(2, 3, -2, 4)))
}

fun maxProduct(nums: IntArray): Int {
    if (nums.size == 1) {
        return nums[0]
    }

    var pro = 1
    var max = Int.MIN_VALUE
    for (i in 0 until nums.size) {
        for (j in i until nums.size) {
            pro *= nums[j]
            if (max < pro)
                max = pro
        }
        pro = 1
    }
    return max
}