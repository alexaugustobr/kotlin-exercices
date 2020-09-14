import java.util.*

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toLong()

	val persons = mutableMapOf<String, String>()

	for (i in 0 until n) {

		val personAndPhone = scan.nextLine()

		val separatorIndex = personAndPhone.lastIndexOf(" ")

		val name = personAndPhone.substring(0, separatorIndex).trim()
		val phone = personAndPhone.substring(separatorIndex).trim()

		persons.put(name, phone)
	}

	val personNames = mutableListOf<String>()
	for (i in 0 until n) {
		personNames.add(scan.nextLine())
	}

	for (personName in personNames) {
		Optional.ofNullable(persons[personName])
				.map {
					println("$personName=$it")
				}.orElseGet {
					println("Not found")
				}
	}

}