package chapter_09.chapter_09_3

import java.util.*

fun main() {
    // 자바의 java.util TreeSet 선언
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet = $intsSortedSet")

    intsSortedSet.clear() // 모든 요소 삭제
    println("intsSortedSet = $intsSortedSet")
}
/*
    결과 :
    intsSortedSet = [2, 4, 6, 7]
    intsSortedSet = []
 */

