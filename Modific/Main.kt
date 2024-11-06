package Module_4.Modific

fun main() {
      println("Задача 1.")
      val registration = Registration()

      println(registration.getEmail())

      registration.setPassword("12345")

      println("__________________")
      println("Задача 2.")
      var myArray = arrayOf(
          arrayOf(1, 2, 3, 4),
          arrayOf(2, 3, 4, 5),
          arrayOf(3, 4, 5, 6),
          arrayOf(4, 5, 6, 7)
      )
      val result = myArray.flatten().sorted()
      var filterLs = result.filter { x -> x % 2 == 0 }
      println("Четные числа: ${filterLs}")

          println("___________________")
    println("Задача 3.")
    val row = 4
    val column = 4
    val array = Array(row) { IntArray(column) }
  
    for (i in 0 until row) {
        for (j in 0 until column) {
            array[i][j] = 1 + (Math.random() * 16).toInt()
        }
    }
    printArray(array, row, column)
    println("___________________")

    println("Задача 4.")
    val arr = listOf(11, 2, 66, 8, -8, 1, -7, -5)
    arr.filter { it > 0 }.forEach { println(it) }

}

//TODO Функция задачи 1
fun printArray(array: Array<IntArray>, row: Int, column: Int) {
    for (i in 0 until row) {
        for (j in 0 until column) {
            print("${array[i][j]} ")
        }
        println()
    }

}

