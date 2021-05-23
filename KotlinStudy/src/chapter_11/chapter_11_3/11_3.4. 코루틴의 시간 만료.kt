package chapter_11.chapter_11_3

import kotlinx.coroutines.*

fun main() = runBlocking {
//    try {
//        withTimeout(1300L) { // Timeout 예외 발생, null로 처리하는 경우 withTimeoutOrNull()을 사용
//            repeat(1000) { i ->
//                println("I`m sleeping $i...")
//                delay(500L)
//            }
//        }
//    } catch(e: TimeoutCancellationException) {
//        println("timed out with $e")
//    }
    try {
        val returnNull = withTimeoutOrNull(1300L) {
            repeat(1000) { i ->
                println("I`m sleeping $i...")
                delay(500L)
            }
        }
        println(returnNull)
    } catch(e: TimeoutCancellationException) {
        println("timed out with $e")
    }
}
/*
    결과 :
    I`m sleeping 0...
    I`m sleeping 1...
    I`m sleeping 2...
    null
 */