

val vowelList = listOf<Char>('a', 'e', 'i', 'o', 'u')

fun main(args: Array<String>) {
	val vowel = readLine()!!
	//val vowel = "aeiouaeiouaeiouaaeeiioouu"
	println(longestSubsequence(vowel))
}

fun longestSubsequence(searchVowel: String): Int {

	val chars = searchVowel.toCharArray()

	val lastIndex = chars.size

	var initialIndex = 0

	var lastLongestSequence = 0;

	while (initialIndex < lastIndex) {

		var curretLongestSequence = 0
		var currentVowelIndex = 0

		for (index in initialIndex until lastIndex) {

			if(isVowel(chars[index])) {

				val isTheSameVowel = vowelList[currentVowelIndex] == chars[index]
				val isNextSequence = currentVowelIndex < vowelList.size - 1
						&& vowelList[currentVowelIndex+1] == chars[index]

				if (isTheSameVowel) {
					curretLongestSequence++
				} else if (isNextSequence) {
					currentVowelIndex++
					curretLongestSequence++
				}
			}
		}

		initialIndex += 1
		if (curretLongestSequence > lastLongestSequence) lastLongestSequence = curretLongestSequence
	}

	return lastLongestSequence
}

fun isVowel(c: Char): Boolean {
	return vowelList.contains(c)
}