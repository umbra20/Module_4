package Module_4.Nasledovanie

open class Animal {
    var weight: Int = 0
    var name: String = ""

    fun eat() {
        println("Ест с руки")
    }

    fun eat2() {
        println("Ест только с блюдце")
    }

    override fun toString(): String {
        return "Animal(weight=$weight, name=$name)"
    }


}