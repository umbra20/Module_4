package Module_4.TheClass

import kotlin.math.roundToInt

fun main() {
    val copter = Copter()
    copter.name = "Ми-17"
    copter.weight = 13000
    copter.maxUp = 4000
    copter.speed = 250
    println("Задача 1.")
    println(
        "Спроектировали вертолет с названием: ${copter.name} \n " +
                "скоростью полета - ${copter.speed} км/ч \n Грузоподъемность  - ${copter.weight} кг" +
                "\n Максимальной взлетной масса - ${copter.maxUp} кг"
    )
    println("_________________________")
    println("Задача 2.")
    val animal = Animal()
    animal.type = "Кот"
    animal.nameAnimal = "Мис"
    animal.weight = 4
    println(
        "Домашние животное: ${animal.type} " +
                "\n по кличке: ${animal.nameAnimal}" +
                "\n Весом: ${animal.weight} кг"
    )

    println("_________________________")
    println("Задача 3.")

    val x = 5.87
    val y: Int = x.roundToInt()
    println("Переменная - $x ")
    println("Перевод к целочисленному типу = $y")

}

// Спроектировали вертолет с названием   скоростью полета .. весом .. высотой полета