
import java.util.*


fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toInt()

	val binaryString = Integer.toBinaryString(n)

	var maxConsecutiveSequence = 0
	var prevNumber = ' ';
	var currentSequence = 0;

	for (number in binaryString) {
		if (number == '1') {
			prevNumber = number

			if (prevNumber == '1') {
				currentSequence = currentSequence.inc()

				if (currentSequence > maxConsecutiveSequence) {
					maxConsecutiveSequence = currentSequence
				}
			} else {
				currentSequence = 1
			}

		} else {
			prevNumber = ' '
			currentSequence = 0
		}
	}

	println(maxConsecutiveSequence)
}
