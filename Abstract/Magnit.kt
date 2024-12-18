package Module_4.Abstract

class Magnit() : Shop() {
    override fun getMeat() {
        return println("Свинина-200р")
    }

    override fun getFruit() {
        return println("Яблоки-100р")


    }

    override fun infoWork() {
        println("Суббота - Выходной")
    }
}