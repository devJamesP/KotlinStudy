package chapter_08.chapter_08_2

fun main() {
    val fruits = arrayOf("banana","avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}
/*
    결과 :
    APPLE
    AVOCADO
 */