package chapter_07.chapter_07_3

fun main() {
    val arr = arrayOf(1,2,3,4,5,6,7,8,9,0)

    println(1 in arr) // 1은 범위에 있음.
    println(arr.contains(10)) // 10은 범위에 없음

}
/*
    결과 :
    true
    false
 */