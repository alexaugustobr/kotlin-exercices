/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
	var leftDiagonal = 0
	var rightDiagonal = 0

	var lineIndex = 0
	var leftToRightIndex = 0
	var rightToLeftIndex = arr.size-1

	while (lineIndex < arr.size) {

		leftDiagonal += arr[lineIndex][leftToRightIndex]
		rightDiagonal += arr[lineIndex][rightToLeftIndex]

		leftToRightIndex++
		rightToLeftIndex--
		lineIndex++
	}

	return  if (rightDiagonal > leftDiagonal) rightDiagonal - leftDiagonal
			else leftDiagonal - rightDiagonal
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

	for (i in 0 until n) {
		arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
	}

	val result = diagonalDifference(arr)

	println(result)
}
