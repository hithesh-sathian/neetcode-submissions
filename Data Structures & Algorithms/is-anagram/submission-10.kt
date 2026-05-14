class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        // Init the hashmaps where we will be counting the char counts
        val countS = HashMap<Char, Int>()
        val countT = HashMap<Char, Int>()

        // Use s or t .indices for counter 
        for (i in s.indices) {
            countS[s[i]] = 1 + countS.getOrDefault(s[i], 0)
            countT[t[i]] = 1 + countT.getOrDefault(t[i], 0)
        }

        // You can compare the contents of a map by setting them equal to each other
        return countS == countT

    }
}
