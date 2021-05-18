package chapter_09.chapter_09_4

fun main() {
    val list = listOf(1,2,3,4,5,6)

    // count: 조건에 맞는 요소 개수 반환
    println(list.count{it % 2 == 0})
}
/*
    결과 :
    3
 */