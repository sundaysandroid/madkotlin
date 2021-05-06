
fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    // 相当于Java中的字符串连接："Hello, " + name + "!"
    println("Hello, $name!")

    println("Hello, \$name!")

    if (args.size > 0) {
        println("Hello, ${args[0]}")
    }

    println("Hello, ${if (args.size > 0) args[0] else "Kotlin"}")
}
