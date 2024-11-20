package Module_4.GetAndSet

class BankCard {
    val numbersCard = 1100300120652144
    private val codCard = 159 // секретный код
    private val passCod = 10  // пароль для просмотра секретного кода

    fun passwordEnter(): Int {
        print("Введите пароль, для просмотра секретного кода: ")
        val input = readln().toInt()

            if (input == passCod) {

                println("Ввели Верно. \n Номер карты: $numbersCard \n Секретный код: $codCard")
                return codCard

            } else if (input != passCod)
                println("Ввели не верно. Попробуйте снова")

        return passwordEnter()

    }
}

fun main() {
    val sberBank = BankCard()
    println("Номер карты: " + sberBank.numbersCard)
    sberBank.passwordEnter()

}



