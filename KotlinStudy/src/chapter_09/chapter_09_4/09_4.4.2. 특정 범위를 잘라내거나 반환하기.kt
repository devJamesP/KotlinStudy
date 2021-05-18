package chapter_09.chapter_09_4

fun main() {
    val list = listOf(1,2,3,4,5,6)

    // slice: 특정 인덱스의 요소들을 잘라서 반환하기
    println("slice: ${list.slice(listOf(0, 1, 2))}")

    println()

    // take: n개의 요소를 반환
    println(list.take(2)) // 앞 두 요소 반환
    println(list.takeLast(2)) // 마지막 두 요소 반환
    println(list.takeWhile { it < 3 }) // 조건식에 따른 반환
}
/*
    결과 :
    slice: [1, 2, 3]

    [1, 2]
    [5, 6]
    [1, 2]
 */