package exs

class SqlSelectBuilder {

	fun build(): String {
		return ""
	}

	private val columns = mutableListOf<String>()

	fun select(vararg columns: String) {
		if (columns.isEmpty()) {
			throw IllegalArgumentException("At least one column should be defined")
		}
		if (this.columns.isNotEmpty()) {
			throw IllegalStateException("Detected an attempt to re-define columns to fetch. "
					+ "Current columns list: "
					+ "${this.columns}, new columns list: $columns")
		}
		this.columns.addAll(columns)
	}

	private lateinit var table: String

	fun from(table: String) {
		this.table = table
	}
}

fun query(initializer: SqlSelectBuilder.() -> Unit): SqlSelectBuilder {
	return SqlSelectBuilder().apply(initializer)
}

fun barf(): (String) -> String = {str -> str.reversed()}

val bar: (String) -> String = {str -> str.reversed()}

fun main() {

	val sql = query {
		select("column1", "column2")
		from("myTable")
	}.build()

	val buz1 = barf()

	//print(buz1("ab"))

	val chat = "14482:30: say: ^1*^7^0FOAF^1*^1^0Tsar^1TommyWiseau: \"try different class\""

	println(toChatMessage(removeColorTags(chat)))




}

val removeColorTags: (String) -> (String) = {it.replace(Regex("\\^+[0-9]"), "")}

//val printChat: (JediAcademyLogDataReader.Chat.Message) -> Unit = { println("${it.playerName}: ${it.message}") }


fun toChatMessage(str: String) : List<CharSequence> {

	val firstSeparator = str.indexOf(":")
	val secondSeparator = str.indexOf(":", firstSeparator+1)
	val thirdSeparator = str.indexOf(":", secondSeparator+1)
	val fourthSeparator = str.indexOf(":", thirdSeparator+1)

	val playerName = str.subSequence(thirdSeparator+2, fourthSeparator)

	val message = str.subSequence(fourthSeparator+2, str.length).replace(Regex("\""), "")

	return listOf(playerName, message)
}
