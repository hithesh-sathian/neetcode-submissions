class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val seen = HashSet<String>()

        for (r in 0 until 9) {
            for (c in 0 until 9) {
                val char = board[r][c]
                if (char == '.') {
                    continue
                }
                val rowKey = "$char in row $r"
                val colKey = "$char in col $c"
                val boxKey = "$char in box ${r / 3}-${c / 3} "

                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey) ) {
                    return false
                }
            }
        }
        return true
    }
}
