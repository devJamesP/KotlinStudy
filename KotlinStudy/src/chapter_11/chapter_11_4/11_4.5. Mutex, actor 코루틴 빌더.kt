package chapter_11.chapter_11_4

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

val mutex = Mutex()
var countext4 = 0

fun main() = runBlocking {
    massiveRun {
        mutex.withLock {
            counter++ // 임계 구역 코드
        }
    }
    println("Counter = $counter")
}
/*
    결과 :
    Completed 1000000 actions in 768 ms
    Counter = 1000000
 */