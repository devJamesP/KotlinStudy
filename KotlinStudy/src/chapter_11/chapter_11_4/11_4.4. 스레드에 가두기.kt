package chapter_11.chapter_11_4

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

// 단일 스레드 문맥을 선언
val counterContext = newSingleThreadContext("CounterContext")
var counter3 = 0

suspend fun massiveRun3(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000 // 실행할 코루틴의 수
    val k = 1000 // 각 코루틴을 반복할 수
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch(context) {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

//fun main() = runBlocking<Unit> {
//    massiveRun3(counterContext) {
//        withContext(counterContext) { // 단일 스레드에 가둠
//            counter3++
//        }
//    }
//    println("Counter = $counter3")
//}
/*
    결과 :
    Completed 1000000 actions in 399 ms
    Counter = 1000000
 */

// massiveRun()에 스레드 가두기
fun main() = runBlocking<Unit> {
    massiveRun3(counterContext) {
        counter3++

    }
    println("Counter = $counter3")
}
/*
    결과 :
    Completed 1000000 actions in 46 ms
    Counter = 1000000
 */