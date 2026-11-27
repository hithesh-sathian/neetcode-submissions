class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val result = IntArray(temperatures.size)
        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[i]> temperatures[stack.last()]) {
                val pastIndex = stack.removeLast()
                val currentIndex = i
                result[pastIndex] = currentIndex - pastIndex
            }
            stack.addLast(i)
        }
        return result 
    }
}
