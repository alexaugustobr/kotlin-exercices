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

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {

	var amountOfNegatives = 0
	var amountOfPositives = 0
	var amountOfZeros = 0

	val divisor = arr.size

	arr.forEach {
		if (it > 0) {
			amountOfPositives++
 		} else if (it < 0) {
			amountOfNegatives++
		} else {
			amountOfZeros++
		}
	}

	println("%.6f".format(amountOfPositives.toFloat()/divisor))
	println("%.6f".format(amountOfNegatives.toFloat()/divisor))
	println("%.6f".format(amountOfZeros.toFloat()/divisor))

}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toInt()

	val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

	plusMinus(arr)
}
