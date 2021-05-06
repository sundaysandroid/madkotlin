data class Animal(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val animals = listOf(Animal("Dog"), Animal("Monkey", age = 8))

    val oldest = animals.maxBy { it.age ?: 0 }

    println("年龄最大的动物是: $oldest")
}

// 年龄最大的动物是: Animal(name=Monkey, age=8)