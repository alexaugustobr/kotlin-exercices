import java.util.*

data class Resultado(val menor: Int, val maior : Int)

fun menorSomaMaiorSoma(numeros: Array<Int>, tamanhoArray: Int): Resultado {
	return Resultado(
			numeros.sortedArray().slice(0..tamanhoArray-2).sum(),
			numeros.sortedArrayDescending().slice(0..tamanhoArray-2).sum()
	)
}

fun main(args: Array<String>) {

	val scan = Scanner(System.`in`)

	val tamanhoArray = scan.nextLine().trim().toInt()

	val numeros = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

	menorSomaMaiorSoma(numeros, tamanhoArray).run {
		println("$menor $maior")
	}
}




