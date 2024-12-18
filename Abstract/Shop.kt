package Module_4.Abstract

abstract class Shop {
    abstract fun getMeat()
    abstract fun getFruit()
    open fun infoWork() {
        println("Работает по будням")
    }

}
