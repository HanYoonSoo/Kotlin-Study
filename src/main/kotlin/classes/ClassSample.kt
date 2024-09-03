package classes

fun main() {
    val aMan = Person()
    aMan.sayHello()
    aMan.introduce()

    aMan.age = 55
    println("sorry, my real age is ${aMan.age}")

    println("=========================================")

    val tim = PersonWithConstructor("Tim", 150)
    val poter = PersonWithConstructor("Poter")
    val harry = PersonWithConstructor(name = "harry", age = 25, etc = "추가값")

    poter.sayHello()
    poter.introduce()

    tim.sayHello()
    tim.introduce()

    harry.sayHello()
    harry.introduce()
}