package chapter_09.chapter_09_4

fun main() {
    val list = listOf<Int>(1,2,3,4,5,6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // maxOrNull, minOrNull 반환 비어있으면 null
    println(list.maxOrNull())
    println(list.minOrNull())

    // maxByOrNull, minByOrNull: 최댓값과 최솟값으로 나온 요소 it에 대한 식의 결과
    println("maxBy: ${map.maxByOrNull { it.key }}") // 키를 기준으로 최댓값
    println("minBy: ${map.minByOrNull { it.key }}") // 키를 기준으로 최솟값
}
/*
    결과 :
    6
    1
    maxBy: 33=C++
    minBy: 11=Java
 */