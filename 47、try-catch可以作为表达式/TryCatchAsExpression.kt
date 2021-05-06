import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main(args: Array<String>) {
    // val reader = BufferedReader(StringReader("239"))
    val reader = BufferedReader(StringReader("abc"))
    println(readNumber(reader))
}