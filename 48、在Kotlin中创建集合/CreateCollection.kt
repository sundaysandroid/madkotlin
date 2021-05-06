
fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 53)

    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "一", 7 to "七", 53 to "五十三")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())
}