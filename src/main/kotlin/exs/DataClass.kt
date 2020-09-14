package exs


data class Pessoa(val nome: String, val idade: Int)


fun main(args: Array<String>) {

	val p = Pessoa("nome", 1)

	val (nome, idade) = p


	println(nome)

	val a = "json tela"

	a.run { println(length) }



}