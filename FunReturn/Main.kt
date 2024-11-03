fun main() {
    val size = 10
    val localMin = IntArray(size) { (1..100).shuffled().first() }

    println("Задача 1.")
    println("Массив:" + localMin.contentToString())
    println()
    println("Количество локальных минимум = ${min(localMin)}")

    println("____________________________")
    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    val size2 = 5
    var provArray = IntArray(size2) { (-100..100).shuffled().first() }
    println("----------------------------------")

    println("Задача 2.")
    println("Данный массив: " + provArray.contentToString())
    println()
    proverka(provArray)
    println("Обработанный массив:")
    println(provArray.contentToString())

    println("____________________________")
    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    val matrix = Array(10) { IntArray(10) }
    var stolb: Int
    var kolonka: Int
    var display: Int

    println("Задача 3. ")
    print("Введите кол-во строк N: ")
    kolonka = readLine()!!.toInt()
    print("Введите кол-во столбцов M: ")
    stolb = readLine()!!.toInt()
    print("Какую строку вывести - K: ")
    display = readLine()!!.toInt()


    for (i in 1..stolb) {
        println("Введите число матрицы $i: ")
        for (j in 1..kolonka) {
            print("$j : ")
            matrix[i][j] = readLine()!!.toInt()
        }
    }


    for (j in 1..kolonka) {

        print(" : ${matrix[display][j]}")
    }
      println("  ")


}


//TODO функция задания №1
fun min(array: IntArray): Int {
    var count = 0
    for (i in 1..(array.size - 2)) {
        if ((array[i - 1] >= array[i]) and (array[i] <= array[i + 1])) {
            count++
        }
    }
    return count
}

//TODO функция задания №2
fun proverka(array: IntArray) {
    for (i in array.indices) {
        if (array[i] < 0) array[i] += 1 else array[i] = array[i]

    }
}

/*fun main() {
    val matrix = Array(10) { IntArray(10) }
    var stolb: Int
    var kolonka: Int
    var display: Int

    print("Введите кол-во строк N: ")
    kolonka = readLine()!!.toInt()
    print("Введите кол-во столбцов M: ")
    stolb = readLine()!!.toInt()
    print("Какую строку вывести - K: ")
    display = readLine()!!.toInt()


    for (i in 1..stolb) {
        println("$i: ")
        for (j in 1..kolonka) {
            print("$j : ")
            matrix[i][j] = readLine()!!.toInt()
        }
    }


    for (j in 1..kolonka) {
        print(" : ${matrix[display][j]}")
    }
    println("  ")
}
*/
