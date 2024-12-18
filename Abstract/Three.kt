package Module_4.Abstract

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Номер действия (1-5): ")
    val N = reader.nextInt()
    print("Длинна в метрах: ")
    val b = reader.nextInt()

    when (N) {
        1 -> {
            print(b * 10.0)
            println(" дм")
        }

        2 -> {
            print(b / 1000.0)
            println(" км")
        }

        3 -> {
            print(b)
            println(" м")
        }

        4 -> {
            print(b * 1000.0)
            println(" мл")
        }

        5 -> {
            print(b * 100.0)
            println(" см")


        }

        else -> {
            println("Ошибка")
        }

    }

}