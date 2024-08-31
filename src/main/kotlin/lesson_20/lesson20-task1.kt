package org.example.lesson_20

fun main() {
    val greetUser: (String) -> String = {username: String ->
        "С наступающим новым годом, $username!"
    }

    val username = "Ivan"
    val greetingMessage = greetUser(username)

    println(greetingMessage)
}