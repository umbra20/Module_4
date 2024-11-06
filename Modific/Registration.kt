package Module_4.Modific

class Registration {
    private var email: String = "example@test.com"


    fun getEmail() = email.uppercase()
    fun setPassword(password :String) {

        if (password.length >= 6) {
         println("Подходящий пароль")
        }
        else println("Длина пароля не соответствует безопасностью")
    }
}