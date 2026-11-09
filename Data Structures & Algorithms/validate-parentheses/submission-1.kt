class Solution {
    fun isValid(s: String): Boolean {
        val validParentheses = mapOf('(' to ')', '{' to '}', '[' to ']')

        val stack = ArrayDeque<Char>()
        for (letter in s) {
            if (letter in validParentheses.values) {
                if (stack.isEmpty()) {
                    return false 
                }
                val top = stack.removeLast()
                val expected = validParentheses[top]
                if (expected != letter) {
                    return false
                }
            } else {
                stack.add(letter)
            }
        }
        if (stack.isEmpty()) {
            return true
        } else {
            return false
        }
    }
}
