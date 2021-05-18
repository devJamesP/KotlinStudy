package chapter_09.chapter_09_3

fun main() {
    val intsHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 7) // 불변성 기능이 없음
    intsHashSet.add(5) // 추가
    intsHashSet.remove(6) // 삭제
    println(intsHashSet)
    // O(1)의 시간을 갖음.
}
/*
    결과 :
    [3, 4, 5, 7]
 */