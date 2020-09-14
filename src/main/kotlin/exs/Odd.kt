
fun Int.isOdd(): Boolean = this % 2 != 0

fun main() {
	println(listOf(1,2,3,4,5).filter(Int::isOdd))
}