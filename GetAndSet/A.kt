package Module_4.GetAndSet

fun main() {
    println("Задание 2.")
    var a = 0
    a += 7
    println(a)
    a -= 4
    println(a)
    a *= 2
    println(a)
    a %= 3
    println(a)
    println("_________________")

    println("Задание 3")
    var oneNumber = 23
    var reverse = 0
    println("Число $oneNumber")
    while (oneNumber != 0) {
        val digit = oneNumber % 10
        reverse = reverse * 10 + digit
        oneNumber /= 10
    }
    println("Перевернутое число: $reverse")
}


