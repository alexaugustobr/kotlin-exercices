
import java.util.*

// Complete the birthdayCakeCandles function below.

//Old version
fun birthdayCakeCandlesOld(ar: Array<Int>): Int {

	var amountOfCandles = 0
	val sortedArray = ar.sortedArrayDescending()

	val bigestCandle = sortedArray.get(0)
	amountOfCandles++

	for (i in 1..sortedArray.lastIndex) {
		if (sortedArray[i] == bigestCandle) {
			amountOfCandles++
		} else {
			return amountOfCandles
		}
	}

	return amountOfCandles
}

//KotlinWay
fun birthdayCakeCandles(ar: Array<Int>): Int {
	return ar.max().let{ max -> ar.count{ it == max } }
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val arCount = scan.nextLine().trim().toInt()

	val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

	val result = birthdayCakeCandles(ar)

	println(result)
}
