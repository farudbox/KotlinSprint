package org.example.lesson_11

class User (
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {

}

fun main() {
    val user1 = User(
        id = 1,
        login = "login1",
        password = "password1",
        mail = "mail1@gmail.com",
    )
    val user2 = User(
        id = 2,
        login = "login2",
        password = "password2",
        mail = "mail2.gmail.com",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)

    println()

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}