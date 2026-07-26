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
        
        // 2. Loop through the actual numbers in this bucket
        for (number in bucket) {
            // Add the number to our final answer list
            result.add(number)
            
            // 3. The moment we have exactly 'k' items, we are done!
            if (result.size == k) {
                return result.toIntArray()
                }
            }
        }
        return result.toIntArray()


        }
}
