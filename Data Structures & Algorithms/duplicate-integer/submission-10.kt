class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val dict = HashSet<Int>()

        for (num in nums) {
            if (dict.add(num) == false) {
                return true
            }
        }
        return false 

    }
}
