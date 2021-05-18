package chapter_09.chapter_09_3

fun main() {
    // Linked list를 이용한 HashSet
    val intsLinkedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75)
    intsLinkedHashSet.add(4)
    intsLinkedHashSet.remove(21)

    println(intsLinkedHashSet)
    intsLinkedHashSet.clear()
    println(intsLinkedHashSet)
}
/*
    결과 :
    [35, 76, 26, 75, 4]
    []
 */