
var opCount = 0

const val UNIX_LINE_SEPARATOR = "\n"
// public static final String UNIX_LINE_SEPARATOR = "\n";

fun performOperation() {
    opCount++
    // .....
}

fun main(args: Array<String>) {
    performOperation()
    performOperation()
    performOperation()

    println("操作执行了 $opCount 次")
}