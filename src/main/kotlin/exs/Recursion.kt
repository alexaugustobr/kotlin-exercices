
import java.util.*

// Complete the factorial function below.
fun factorial(n: Int): Int {
	//Base case
	if (n <=1) {
		return 1;
	}
	//Recursive case
	return factorial(n-1) * n
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toInt()

	val result = factorial(n)

	println(result)
}
