
import Color.*

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

fun getWarmth(color: Color) =
        when (color) {
            Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
            Color.GREEN -> "neutral"
            Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
        }

fun getWarmth2(color: Color) =
        when (color) {
            RED, ORANGE, YELLOW -> "warm"
            GREEN -> "neutral"
            BLUE, INDIGO, VIOLET -> "cold"
        }

fun main(args: Array<String>) {
    println(getColorName(Color.GREEN))
    println(getWarmth(Color.ORANGE))
    println(getWarmth2(Color.ORANGE))
}