class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()

        for (i in strs) {
            val sortedWord = i.toCharArray().sorted().joinToString("")
            map.getOrPut(sortedWord){mutableListOf()}.add(i)
        }
        return map.values.toList()
    }
}
