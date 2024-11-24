package Module_4.Nasledovanie

fun main() {
    val dog = Dog()
    println("Задание 1")
    dog.weight = 30
    dog.name = "Рэкс"
    println(dog.toString())
    dog.eat()
    dog.voice()
    println("_________________")

    val cat = Cat()
    cat.weight = 3
    cat.name = "Киса"
    println(cat.toString())
    cat.eat2()
    cat.toString()
    cat.voice()
    println("____________________")

    println("Задание 2.")
    val nokia = Nokia()
    nokia.android = 12
    nokia.color = "Черный"
    nokia.call()
    println(nokia.toString())
    println()

    val iPhone = IPhone()
    iPhone.iPhone = 20
    iPhone.color = "White"
    iPhone.call()
    println(iPhone.toString())
    println("____________________")

    println("Задание 3.")
    var arrayInt = arrayOf(3, 67, 1, 55, 65, 89, 23)
    val d = arrayInt.filter { it % 5 == 0 }
    println("${d.joinToString(" ")}")
}


