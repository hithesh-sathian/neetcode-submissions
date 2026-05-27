class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramMap = HashMap<String, MutableList<String>>()

        for (str in strs){
            val sortedKey = str.toCharArray().sorted().joinToString("")
        
            anagramMap.getOrPut(sortedKey) {mutableListOf()}.add(str)
        }

        val sublists = ArrayList<List<String>>()

        for (list in anagramMap.values){
            sublists.add(list)
        }

        return sublists
    }
}
