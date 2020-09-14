
import java.util.*


fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toInt()
	val binary = Integer.toBinaryString(n).toCharArray()

	var tmpCount = 0 // count consecutive ones

	var maxCount = 0 // running maximum of consecutive ones

	for (i in binary.indices) {
		// reset to 0 if we hit a '0' char
		tmpCount = if (binary[i] == '0') 0 else tmpCount + 1

		// set max
		if (tmpCount > maxCount) {
			maxCount = tmpCount
		}
	}
	println(maxCount)

}
