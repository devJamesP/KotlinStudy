package chapter_09.chapter_09_5

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val listDefault = list1
        .map { println("map($it) "); it * it} // 1
        .filter { println("filter($it) "); it % 2 == 0 } // 2
    println(listDefault)



}
/*
    결과 :
    map(1)
    map(2)
    map(3)
    map(4)
    map(5)
    filter(1)
    filter(4)
    filter(9)
    filter(16)
    filter(25)
    [4, 16]
 */