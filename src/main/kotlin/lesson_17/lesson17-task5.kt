package org.example.lesson_17

class User(var login: String, private var password: String) {

    val maskedPassword: String
        get() = "*".repeat(password.length)

    var passwordSetter: String
        set(value) {
            println("Вы не можете изменить пароль.")
        }
        get() = password

    var loginSetter: String = login
        set(value) {
            field = value
            println("Логин успешно изменен на \"$value\".")
        }
        get() = field
}

fun main() {
    val user = User(login = "user123", password = "mySecretPassword")

    println("Текущий пароль: ${user.maskedPassword}")

    user.passwordSetter = "newPassword"

    user.loginSetter = "newUser456"

    println("Текущий логин: ${user.loginSetter}")
}