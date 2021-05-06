fun main(args: Array<String>) {
    val person = Person("Bob", true)

    println(person.name)

    person.isMarried = false
    println(person.isMarried)
}