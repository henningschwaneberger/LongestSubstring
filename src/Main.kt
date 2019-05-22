fun main() {
    val s = "abppplee"
    val d: List<String> = listOf("able", "ale", "apple", "bale", "kangaroo", "applee")

    println(findLongestSubString(s,d))
}

fun findLongestSubString(s: String, d: List<String>): Any? {
    var longest = ""
    var currentStringIndex = 0
    var currentChar: Char
    val listOfSubStrings: MutableList<String> = mutableListOf()

    // loop through words in dictionary
    for (word in d) {
        var isSubString = false
        // loop through chars in word
        for (j in 0 until word.length) {
            currentChar = word[j]
            currentStringIndex = s.indexOf(currentChar,currentStringIndex)

            // if a char is not in the remaining string sequence the word is no subString
            if (currentStringIndex == -1) break

            // check if all chars were sequentially found
            if (j == word.length-1) isSubString = true

        }

        // put subString to list of subStrings
        if (isSubString) listOfSubStrings.add(word)
    }

    // find longest of the substrings
    for (subString in listOfSubStrings) {
        if (longest.length < subString.length) longest = subString
    }
    
    return longest
}
