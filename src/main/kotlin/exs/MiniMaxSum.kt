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

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {

	var min : Long? = null
	var max : Long? = null

	for(ignoreIndex in arr.indices) {

		var currentSum = 0L
		for(i in arr.indices) {
			if (i != ignoreIndex){
				currentSum += arr[i]
			}
		}

		if (max == null || currentSum > max) {
			max = currentSum
		}

		if (min == null || currentSum < min) {
			min = currentSum
		}

	}

	println("$min $max")
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

	miniMaxSum(arr)
}
