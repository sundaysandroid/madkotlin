

fun main(args: Array<String>) {
    var i = 0

    while (i < 3) {
        println("i = $i")
        i += 1
    }

    i = 0

    while (i < 0) {
        println("i = $i")
        i += 1
    }

    var j = 0

    do  {
        println("j = $j")
        j += 1
    } while (j < 0)
}