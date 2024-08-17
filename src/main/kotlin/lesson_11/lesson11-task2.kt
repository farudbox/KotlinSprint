package org.example.lesson_11

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String? = null
) {
    fun outputUserInformation() {
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun editBio() {
        println("Опишите себя: ")
        bio = readln()
    }

    fun changePassword() {
        println("Введите свой старый пароль: ")
        val oldPassword = readln()

        if (oldPassword == password) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменен!")
        }
    }
}

fun main() {
    val user1 = User2 (
        id = 1,
        login = "login",
        password = "password",
        mail = "mail@mail.com",
    )

    user1.editBio()
    user1.changePassword()
    user1.outputUserInformation()
}