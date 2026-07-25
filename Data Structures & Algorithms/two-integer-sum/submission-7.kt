class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val prevMap = HashMap<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]
            val complementIndex = prevMap[complement]

            if (complementIndex != null){
                return intArrayOf(complementIndex, i)
            }

            // Otherwise, save the current number and its index for later
            prevMap[nums[i]] = i

        }
        return intArrayOf()
    }
}
