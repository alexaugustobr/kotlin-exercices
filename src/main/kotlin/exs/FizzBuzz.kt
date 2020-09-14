import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*



/*
 * Complete the 'fizzBuzz' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun fizzBuzz(n: Int): Unit {

	for(i in 1..n) {

		val multipleOf3 = i % 3 == 0
		val multipleOf5 = i % 5 == 0

		if (!multipleOf3 and !multipleOf5) {
			println(i)
			continue
		}

		if (multipleOf3 and multipleOf5) {
			println("FizzBuzz")
			continue
		}

		if (multipleOf5 and !multipleOf3) {
			println("Buzz")
			continue
		}

		if (multipleOf3 and !multipleOf5) {
			println("Fizz")
			continue
		}


	}

}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	fizzBuzz(n)
}
