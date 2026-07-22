class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val counts = IntArray(26)

        for (char in s) {
            counts[char - 'a'] = counts[char - 'a'] + 1
        }

        for (char in t){
            counts[char - 'a'] = counts[char - 'a'] - 1
        }

        for (count in counts) {
            if (count != 0){
                return false 
            }
        }
        
        return true
    }
}
