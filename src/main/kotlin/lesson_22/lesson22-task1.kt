package org.example.lesson_22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val regularBook1 = RegularBook("regular_book", "author")
    val regularBook2 = RegularBook("regular_book", "author")

    val dataBook1 = DataBook("data_book", "author")
    val dataBook2 = DataBook("data_book", "author")

    println(regularBook1 == regularBook2)
    println(dataBook1 == dataBook2)

    /*
    1. В случае обычного класса `RegularBook`, оператор `==` сравнивает ссылки на объекты, а не их содержимое.
    Так как `regularBook1` и `regularBook2` — это два разных объекта в памяти, результат сравнения будет `false`.

    2. В случае data-класса `DataBook`, оператор `==` сравнивает содержимое объектов (поля `title` и `author`).
    Так как содержимое объектов `dataBook1` и `dataBook2` одинаково, результат сравнения будет `true`.
     */
}