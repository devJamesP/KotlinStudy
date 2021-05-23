package chapter_11.chapter_11_4

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

var counter =  0 // 병행 처리 중 문제가 발생할 수 있는 변수

suspend fun massiveRun(action: suspend () -> Unit) {
    val n = 1000 // 실행할 코루틴의 수
    val k = 1000 // 각 코루틴을 반복할 수
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking {
    massiveRun {
        counter++ // 증가 연산에서 값에서 무결성에 문제가 발생할 수 있음.
    }
    println("Counter = $counter")
}
/*
    결과 :

 */