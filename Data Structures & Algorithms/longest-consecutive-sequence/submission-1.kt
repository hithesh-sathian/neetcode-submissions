class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val seen = HashSet<Int>()
        var longestStreak = 0

        for (num in nums) {
            seen.add(num)
        }

        for (num in seen) {
            if ((num - 1) !in seen) {
                var currentNum = num
                var currentStreak = 1

                while ((currentNum + 1) in seen){
                    currentNum += 1
                    currentStreak +=1
                }

                if (longestStreak < currentStreak) {
                    longestStreak = currentStreak
                }
            }
        }
        return longestStreak
    }
}
