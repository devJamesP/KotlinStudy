package chapter_11.chapter_11_3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    GlobalScope.launch { // 만일 launch만 사용하면 종료되지 않음.
        repeat(1000) { i ->
            println("I`m sleeping $i...")
            delay(500L)
        }
    }
    delay(1300L)

    // 동일한 코드
//    val job = launch {
//        repeat(1000) {i ->
//            println("I`m sleeping $i...")
//            delay(500L)
//        }
//    }
//    delay(1300L)
//    job.cancel()

}
/*
    결과 :
    I`m sleeping 0...
    I`m sleeping 1...
    I`m sleeping 2...
 */