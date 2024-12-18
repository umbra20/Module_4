package Module_4.Abstract

class Pyterochka() : Shop() {
    override fun getMeat() {
        return println("Окорок - 25р")
    }

    override fun getFruit() {
        return println("Виноград - 120р")
    }

    override fun infoWork() {
        println("Скидки по понедельникам")
    }
}