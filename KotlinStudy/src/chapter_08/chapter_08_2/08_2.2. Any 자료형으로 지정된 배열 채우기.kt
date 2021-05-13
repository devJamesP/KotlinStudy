package chapter_08.chapter_08_2

fun main() {
    val b = Array<Any>(10){ 0 }
    b[0] = "Hello World"
    b[1] = 1.1
    println(b[0])
    println(b[1])
    println(b[2])
}
/*
    결과 :
    Hello World
    1.1
    0
 */