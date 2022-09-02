fun main() {
    print(containsDuplicate(intArrayOf(1, 2, 3, 1)))
}

fun containsDuplicate(nums: IntArray): Boolean {
//runtime 767ms | memory usage 74.3 MB
    return nums.size > nums.toSet().size
}

fun containsDuplicate2(nums: IntArray): Boolean {
//runtime 1519ms | memory usage 47.9 MB
    var array = intArrayOf()
    for (i in 0 until nums.size) {
        if (array.contains(nums[i]))
            return true
        array += nums[i]
    }
    return false
}