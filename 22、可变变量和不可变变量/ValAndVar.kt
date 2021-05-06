
fun main(args: Array<String>) {
    val a = 3
    val b = 5

    val str: String
    if (a > b) {
        str = "OK"
    } else {
        str = "Cancel"
    }

    val languages = arrayListOf("Java") // 声明一个不可变的引用
    languages.add("Kotlin") // 修改引用指向的对象

    // 编译器在推断变量的数据类型的时候，仅仅是通过变量的初始值进行推断
    // 而不会根据对变量初始化之后再给变量重新赋的值进行推断
    var i = 18
    // i = "hello"
}
