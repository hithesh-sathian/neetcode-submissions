class Solution {

    fun encode(strs: List<String>): String {
        // Use StringBuilder instead of standard String so we   can use append
        val encodedWord = StringBuilder()
        // if list is empty return an empty string 
        if (strs.isEmpty()){
            return "";
        }

        for (word in strs){
            val wordLength = word.length
            encodedWord.append(wordLength).append("!").append(word)
        }

        // Convert StringBuilder back to regular string 
        return encodedWord.toString()

    }

    fun decode(str: String): List<String> {
        val listOfWords = mutableListOf<String>()
        var i = 0

        while (i<str.length){
            var j = i
            while (str[j] != '!'){
                j++
            }

            val wordLength = str.substring(i,j).toInt()
            val wordStart = j + 1
            val wordEnd = wordStart + wordLength

            val word = str.substring(wordStart, wordEnd)
            listOfWords.add(word)
            i = wordEnd
        }
        return listOfWords
    }
}
