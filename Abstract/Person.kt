package Module_4.Abstract

abstract class Person(_names: String, _surname: String) {
    var names: String
    var surname: String
    abstract var ages: Int

    init {
        this.names = _names
    }

    init {
        this.surname = _surname
    }

    abstract fun setPersonAge(_age: Int)
    abstract fun getPersonAge(): Int

    open fun info(){
        println("Занят")
    }
    fun getPersonName() {
        println("Имя = $names")
    }

    fun getPersonSurname() {
        println("Фамилия = $surname")
    }
}

class Employee(_name: String, _surname: String) : Person(_name, _surname) {
    override var ages: Int = 0

    override fun setPersonAge(_ages: Int) {
        ages = _ages
    }

    override fun getPersonAge(): Int {
        return ages
    }

    override fun info() {
        println("Работник")
    }
}

class Student(_name: String, _surname: String) : Person(_name, _surname) {
    override var ages: Int = 0

    override fun setPersonAge(_ages: Int) {
        ages = _ages
    }

    override fun getPersonAge(): Int {
        return ages
    }

    override fun info() {
        println("Студент")
    }
}

fun main(args: Array<String>) {
    val employee = Employee("Петуня", "Петькин")
    var student = Student("Василий", "Васильевич")
    var ages: Int

    employee.info()
    employee.getPersonSurname()
    employee.setPersonAge(21)
    ages = employee.getPersonAge()
    employee.getPersonName()
    println("Возраст = $ages")
println("_________________________")
    student.info()
    student.getPersonSurname()
    student.setPersonAge(19)
    ages = student.getPersonAge()
    student.getPersonName()
    println("Возраст = $ages")

}
