package chapter_09.chapter_09_4

fun main() {
    val list = listOf(1,2,3,4,5,6)

    // all: 모든 요소가 일치해야 true
    println(list.all { it > 10 })
    println(list.all { it % 2 == 0})

    // any: 최소한 하나 혹은 그 이상의 특정 요소가 일치해야 true
    println(list.any { it % 2 == 0})
    println(list.any { it > 10 })
}
/*
    결과 :
    true
    false
    true
    false
 */