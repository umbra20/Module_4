package Module_4.Konstruktor

import Module_2.NestedInner.Car

fun main() {
    println("Задача 1.")
    val box = Box(2, 3, 4)
    println("Объем коробки" + box.getVolume())
    println("__________________________")

    println("Задача 2.")
    println()
    printArrayMinMax(arrayOf(12, 5, 56, 10, 5, 1, 6, 88))
    println("__________________________")

    println("Задача 3.")
    numberArray()
    println("__________________________")

    println("Задача 4.")
    print("Введите число: ")
    strokaInfo()
    println("__________________________")

    println("Задача 5.")
   val car = Car (2000,250)
    println("Скорость машины : ${car.speedCar} км/ч, Вес машины: ${car.weightCar} кг")


}

fun printArrayMinMax(numbers: Array<Int>) {     //TODO Функция задачи 2
    val minNumber = numbers.min()
    val maxNumber = numbers.max()

    println("Минимальное число: $minNumber из ${numbers.contentToString()}\n")
    println("Максимальное число: $maxNumber из ${numbers.contentToString()}")
}

fun numberArray() {                             //TODO Функция задачи 3
    var numArray = arrayOf(3, 67, 1, 55, 65, 89, 23)
    println("Массив целых чисел:   ${numArray.contentToString()}")
}

fun strokaInfo() {
    val number: Int = readLine()!!.toInt()

    if (number > 0) {
        if (number % 2 == 0) {
            println("Положительное четное число")
        } else {
            println("Положительное нечетное число")
        }
    } else if (number < 0) {
        if (number % 2 == 0) {
            println("Отрицательное четное число")
        } else {
            println("Отрицательное нечетное число")
        }
    } else {
        println("Нулевое число")
    }
}