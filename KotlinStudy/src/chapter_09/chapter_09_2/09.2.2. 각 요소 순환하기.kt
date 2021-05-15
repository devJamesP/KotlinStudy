package chapter_09.chapter_09_2

fun main() {
    val fruits = listOf("apple", "banana", "kiwi")
    for (item in fruits) {
        println(item)
    }

    for (index in fruits.indices) { // 인덱스 지정
        println("fruits[$index] = ${fruits[index]}")
    }

    for (index in fruits.indices) { // 인덱스 지정
        if (index % 2 == 0) println("fruits[$index] = ${fruits[index]}") // 짝수만 고르기
    }

    var index = 0
    while (index < fruits.size) {
        println("fruits[$index] = ${fruits[index]}")
        index++
    }
}
/*
    결과 :
    apple
    banana
    kiwi
    fruits[0] = apple
    fruits[1] = banana
    fruits[2] = kiwi
    fruits[0] = apple
    fruits[2] = kiwi
    fruits[0] = apple
    fruits[1] = banana
    fruits[2] = kiwi
 */