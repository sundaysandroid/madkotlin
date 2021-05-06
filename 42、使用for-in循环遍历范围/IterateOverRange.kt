
fun divideInt(i: Int) = when {
    i % 3 == 0 -> "$i: 3的倍数"
    i % 4 == 0 -> "$i: 4的倍数"
    else -> "$i"
}

fun main(args: Array<String>) {
    val oneToTen = 1..10

    for (i in oneToTen) {
        println(divideInt(i))
    }

    for (i in 10 downTo 1) {
        println(divideInt(i))
    }

    for (i in 10 downTo 1 step 2) {
        println(divideInt(i))
    }

    for (i in 1 until 11) {
        println(divideInt(i))
    }
}