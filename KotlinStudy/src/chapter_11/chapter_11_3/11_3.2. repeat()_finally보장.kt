package chapter_11.chapter_11_3

import kotlinx.coroutines.*

fun main() = runBlocking {
    // finally의 실행 보장
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I`m sleeping $i...")
                delay(500L)
            }
        } finally {
//            delay(1000L) // Bye!!출력을 보장받지 못함.
//            println("Bye!!")

            withContext(NonCancellable) {  // finally의 완정한 실행을 보장함
                println("I`m running finally")
                delay(1000L)
                println("Non-Cancellable") // 1초를 지연해도 취소되지 않음
            }
        }
    }
    delay(1300L)
    job.cancelAndJoin() // 작업을 취소하고 완료될 때까지 기다림
    println("main: Quit!")
}
/*
    결과 :
    I`m sleeping 0...
    I`m sleeping 1...
    I`m sleeping 2...
    Bye!!
    main: Quit!
 */