package exs

import java.util.*

fun Int.isOdd(): Boolean = this % 2 != 0

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toInt()

	val words = mutableListOf<String>()

	for (i in 0 until n) {
		words.add(scan.nextLine())
	}

	for (word in words) {
		var oddChars = ""
		var evenChars = ""

		for (i in word.indices) {
			if (i.isOdd()) {
				oddChars += word[i]
			} else {
				evenChars += word[i]
			}
		}

		println("$evenChars $oddChars")
	}

}