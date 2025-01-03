package Module_4.InterFace

fun main() {
    val police = Police("Полиция", 112)


    police.infoString()
    police.getDescription()
    println("Номер телофона - " + police.phone)

    getLine(sample = "_"  )

    println("\n Задание 2.")

    var firstNumber: Int
    var secondNumber: Int
    println("Нахождение общего делителя (НОД)")
    print("A: ")
    firstNumber = readLine()?.toInt() ?: 0
    print("B: ")
    secondNumber = readLine()?.toInt() ?: 0
    while (firstNumber != 0 && secondNumber != 0) {
        if (firstNumber > secondNumber) firstNumber %= secondNumber
        else secondNumber %= firstNumber
    }
    println("Итого: " + firstNumber + secondNumber)

    getLine(sample = "_"  )
    println("\n Задание 3.")
    println("Найти второе максимальное число")

    val numbersList = listOf(11, 55, 4, 41, 5)

    var largestNumber = Double.NEGATIVE_INFINITY
    var secondLargestNumber = Double.NEGATIVE_INFINITY

    println(numbersList)
    for (number in numbersList) {

        if (number > largestNumber) {

            secondLargestNumber = largestNumber

            largestNumber = number.toDouble()

        } else if (number > secondLargestNumber && number.toDouble() != largestNumber) {

            secondLargestNumber = number.toDouble()
        }
    }

    println("Второе мах число - " + secondLargestNumber)
}

fun getLine(sample: String) {  //линия разделительная
    for (i in 0..20) {
        print(sample)
    }
}

class Police(
    namez: String,
    phone: Int
) : Extra(namez, phone) {
    override fun infoString() {
        println("Правоохранительные органы")
    }

    override fun getDescription() {
        println("Полиция")
    }

}


