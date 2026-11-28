class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
      val stack = ArrayDeque<Double>()
      var carMap = HashMap<Int, Int>()
      for (i in position.indices) {
        carMap[position[i]] = speed[i]
      }
      val sortedPositions = carMap.keys.sortedDescending()
      for (pos in sortedPositions) {
        val time = (target - pos).toDouble() / carMap[pos]!!
        if (stack.isEmpty() || time > stack.last()){
            stack.addLast(time)
        }
        else if ( time <= stack.last()) {
            continue
        }
      }
      return stack.size
    }
}
