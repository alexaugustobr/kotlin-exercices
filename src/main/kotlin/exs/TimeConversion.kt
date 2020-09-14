import java.util.*
import java.util.stream.Collectors

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(time: String): String {

	val indexOfAmPm = time.lastIndex - 1

	val timeType = time.subSequence(indexOfAmPm, time.length)

	val timeInts : Array<Int> = time.subSequence(0, indexOfAmPm)
			.split(":")
			.stream()
			.map { it.toInt() }
			.collect(Collectors.toList())
			.toTypedArray()

	//timeInts[0] = hour
	if (timeInts[0] < 12 && timeType == "PM") {
		timeInts[0] = timeInts[0] + 12
	} else if (timeInts[0] == 12 && timeType == "AM") {
		timeInts[0] = 0
	}

	return "%02d:%02d:%02d".format(timeInts[0], timeInts[1], timeInts[2])

}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val s = scan.nextLine()

	val result = timeConversion(s)

	println(result)
}
