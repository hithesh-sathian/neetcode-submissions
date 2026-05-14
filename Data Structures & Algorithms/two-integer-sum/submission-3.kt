class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val prevMap = HashMap<Int, Int>()

        for (i in nums.indices){
            val currentNum = nums[i]
            val difference = target - currentNum
            
            // check if difference is seen
            if (prevMap.containsKey(difference)) {
                return intArrayOf(prevMap[difference]!!, i)
            }

            prevMap[currentNum] = i
        }

        return intArrayOf()
    }
}
