package chapter_09.chapter_09_3

fun main() {
    val mixedTypeSet = setOf("Hello", 5, "world", 3.14, 'c') // 자료형 혼합 초기화
    var intSet: Set<Int> = setOf<Int>(1, 5, 5) // 정수형만 초기화 (중복 허용 x)

    println(mixedTypeSet)
    println(intSet)
}
/*
    결과 :
    [Hello, 5, world, 3.14, c]
    [1, 5]
 */