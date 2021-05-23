package chapter_11.chapter_11_2

val fibonacciSeq = sequence {
    var a = 0
    var b = 1
    yield(1) // 1. 지연 함수가 사용함

    while(true) {
        yield(a + b) // 2.
        val tmp = a + b
        a = b
        b = tmp
    }
}

fun main() {
    println(fibonacciSeq.take(8).toList()) // 3. 8개의 값을 획득
}
/*
    결과 :
    [1, 1, 2, 3, 5, 8, 13, 21]

 */

// 523p 참고