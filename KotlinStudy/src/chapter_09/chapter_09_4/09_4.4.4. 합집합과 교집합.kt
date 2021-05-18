package chapter_09.chapter_09_4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    // distinct: 중복 요소는 하나로 취급해 List 반환
    println("distinct: " + listRepeated.distinct())

    // intersect: 교집합 요소만 골라냄
    println("intersect: ${list.intersect(listOf(5, 6, 7, 8))}")
}