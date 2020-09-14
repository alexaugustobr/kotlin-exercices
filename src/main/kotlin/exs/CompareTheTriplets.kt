// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

	var alicePoints = 0
	var bobPoints   = 0

	for(i in 0 until 3) {
		if(a[i] > b[i]) {
			alicePoints++
		} else if(a[i] < b[i]) {
			bobPoints++
		}
	}

	return arrayOf(alicePoints, bobPoints)
}

fun main(args: Array<String>) {
	val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	val result = compareTriplets(a, b)

	println(result.joinToString(" "))
}
