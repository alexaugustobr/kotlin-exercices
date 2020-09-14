package exs

import java.util.*

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toInt()

	for (i in 1..10) {
		val x = n*i
		println("$n x $i = $x")
	}

}