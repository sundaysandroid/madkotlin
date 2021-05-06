
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "这是个数字！"
    in 'a'..'z', in 'A'..'Z' -> "这是个字母！"
    else -> "不知道..."
}

fun main(args: Array<String>) {
    println(isLetter('m'))
    println(isNotDigit('x'))

    println(recognize('8'))

    println("JavaScript" in "Java".."Kotlin")

    println("JavaScript" in setOf("Java", "Kotlin"))
    println("JavaScript" !in setOf("Java", "Kotlin"))
}