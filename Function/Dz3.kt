package Module_4.Function

fun main() {
    println(
        "Задача 3. Написать функцию, которая принимает два целых числа a и b. " +
                "\n Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.\n"
    )
    print("Введите первое число: ")
    val x = readLine()!!.toInt()
    print("Введите второе число: ")
    val y = readLine()!!.toInt()
    val num = numBig(x, y)
    println("НОД  : $num")
}

fun numBig(x: Int, y: Int): Int {
    return if (y == 0) x else numBig(y, x % y)
}