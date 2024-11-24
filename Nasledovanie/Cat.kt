package Module_4.Nasledovanie

class Cat : Animal() {

    fun voice() {
        println("мяу")
    }

    override fun toString(): String {
        return "Кошка (Вес = $weight, Имя = $name)"
    }
}