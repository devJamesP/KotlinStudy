package chapter_09.chapter_09_5

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val listSeq = list1.asSequence()
        .map { print("map($it) "); it * it } // 1
        .filter { print("filter($it)\n"); it % 2 == 0} // 2
        .toList() // 3
    println(listSeq)
}