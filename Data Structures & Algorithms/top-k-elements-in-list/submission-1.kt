class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val occurrencesMap = HashMap<Int, Int>()

        for (num in nums) {
            val count = occurrencesMap[num]
            if (count != null){
                occurrencesMap[num] = count + 1
            }
            else {
                occurrencesMap[num] = 1
            }
        }

        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }

        for ((num, freq) in occurrencesMap) {
            buckets[freq].add(num)
        }

        val result = mutableListOf<Int>()

            
        for (i in buckets.size - 1 downTo 0) {
        
        val bucket = buckets[i]
        
        for (number in bucket) {
            result.add(number)
            if (result.size == k) {
                return result.toIntArray()
                }
            }
        }
        return result.toIntArray()


        }
}
