package exs

import java.io.File
import java.nio.charset.Charset
import java.util.*

fun main(args: Array<String>) {

	val ins = File("/home/admin/Documents/git/kotlin-exercices/src/main/kotlin/exs/DictionariesMapsInput.txt")

	val readLines = ins.readLines(Charset.defaultCharset())

	val iterator = readLines.iterator()

	val n = iterator.next().toInt()

	val persons = mutableMapOf<String, String>()

	val personNames = mutableListOf<String>()

	var readedLines : Int = 0
	while (iterator.hasNext()) {
		val personAndPhone = iterator.next()
		val separatorIndex = personAndPhone.lastIndexOf(" ")

		val name = personAndPhone.substring(0, separatorIndex).trim()
		val phone = personAndPhone.substring(separatorIndex).trim()

		persons.put(name, phone)

		readedLines+=1

		if (readedLines == n) {
			break;
		}

	}

	while (iterator.hasNext()) {
		val personName = iterator.next()
		personNames.add(personName)
	}

	val reads = mutableListOf<String>()
	for (personName in personNames) {
		Optional.ofNullable(persons[personName])
				.map {
					reads.add("$personName=$it")
				}.orElseGet {
					reads.add("Not found")
				}
	}

	val outs = File("/home/admin/Documents/git/kotlin-exercices/src/main/kotlin/exs/DictionariesMapsOutput.txt")

	val readLinesR = outs.readLines(Charset.defaultCharset())


	reads.forEachIndexed { index, value ->
		println(value)
	}



}