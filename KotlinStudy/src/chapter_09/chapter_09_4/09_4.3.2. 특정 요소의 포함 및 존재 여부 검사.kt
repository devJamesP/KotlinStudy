package chapter_09.chapter_09_4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // contains: 요소가 포함되어 있으면 true를 반환
    println("contains: ${list.contains(2)}")
    println(2 in list)
    println(map.contains(11))
    println(11 in map)

    // containsAll: 모든 요소가 포함되어 있으면 true를 반환
    println("containsAll: ${list.containsAll(listOf(1, 2, 3))}")

    println()

    // none: 요소가 없으면 true, 있으면 false를 반환
    println("none: ${list.none()}")
    println("none: ${list.none { it > 6}}")

    // isEmpty/isNotEmpty: 컬렉션이 비어 있는지 아닌지 검사
    println(list.isEmpty())
    println(list.isNotEmpty())
}
/*
    결과 :
    contains: true
    true
    true
    true
    containsAll: true

    none: false
    none: true
    false
    true
 */