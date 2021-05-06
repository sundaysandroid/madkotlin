
fun doSomething(number: Int) {
    val percentage =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException("非法参数异常")

    println(percentage)
}

fun main(args: Array<String>) {
    val percentage = 58

    if (percentage !in 0..100) {
        throw IllegalArgumentException("非法参数异常")
    }

    doSomething(123)
}