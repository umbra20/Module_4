package Module_4.Function

fun main() {

    println("Задача 1. Написать функцию возведения числа a в степень n")

    powNumber(3)
}

fun powNumber(a: Int) {
    val pow = 2
    val result = Math.pow(a.toDouble(), pow.toDouble())

    println("Значение $a в степени 2 = $result")

}
