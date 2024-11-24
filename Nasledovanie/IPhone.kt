package Module_4.Nasledovanie

open class IPhone {
    var iPhone: Int = 0
    var color: String = ""

    fun call() {
        println("Звонок")
    }

    override fun toString(): String {
        return "IPhone(iPhone=$iPhone, Цвет='$color')"
    }

}