import java.util.*

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }


    val list = arrayListOf("123", "467", "73")

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

}