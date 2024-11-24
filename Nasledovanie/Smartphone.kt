package Module_4.Nasledovanie

open class Smartphone {
    var android: Int = 0
    var color: String = ""

    fun call() {
        println("Абонент звонит")
    }

    override fun toString(): String {
        return "Смартфон ( android=$android, Цвет='$color')"
    }


}