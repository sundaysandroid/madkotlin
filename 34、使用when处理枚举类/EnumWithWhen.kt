
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getColorName(color: Color) =
        when (color) {
            Color.RED -> "红"
            Color.ORANGE -> "橙"
            Color.YELLOW -> "黄"
            Color.GREEN -> "绿"
            Color.BLUE -> "蓝"
            Color.INDIGO -> "靛"
            Color.VIOLET -> "紫"
        }

fun main(args: Array<String>) {
    println(getColorName(Color.GREEN))
}