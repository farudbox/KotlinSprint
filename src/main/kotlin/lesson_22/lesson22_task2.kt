package org.example.lesson_22

class RegularBook2(val title: String, val author: String)

data class DataBook2(val title: String, val author: String)

fun main() {
    fun main() {
        val regularBook2 = RegularBook2("regular_book", "author")

        val dataBook2 = DataBook2("data_book", "author")

        println(regularBook2)
        println(dataBook2)
    }

    /*
    Объяснение:
    1. В случае обычного класса `RegularBook2`, при выводе объекта в консоль будет использован стандартный метод `toString()`,
       который не переопределен и возвращает строку в формате "ИмяКласса@ХэшКод". Поэтому вывод будет что-то вроде "RegularBookNew@1b6d3586".

    2. В случае data-класса `DataBook2`, метод `toString()` автоматически генерируется компилятором и возвращает строковое представление
       объекта, содержащее значения всех его свойств в формате "DataBookNew(title=..., author=...)".
       Поэтому вывод будет выглядеть как "DataBookNew(title=Kotlin Programming, author=John Doe)".
    */

}