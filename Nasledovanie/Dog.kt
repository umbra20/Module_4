package Module_4.Nasledovanie

class Dog: Animal() {

fun voice() {
    println("Лает")
}

    override fun toString(): String {
        return "Собака (Вес = $weight, Имя = $name)"
    }
}