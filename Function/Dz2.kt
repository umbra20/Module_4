package Module_4.Function

fun main() {
    println(
        "Задача 2. Написать функцию, которая принимает два целых числа a и b (a<b). \n" +
                "Она вычисляет произведение  всех целых чисел от a до b включительно.\n"
    )
    twoNumbers(2, 4)
}

fun twoNumbers(a: Int, b: Int) {
    print("a: $a \t b: $b \n")
    var c = 1
    for (i in a..b) {
        c *= i
    }
    println("Произведение чисел от $a .. $b = " + c)

}