package chapter_10.chapter_10_3

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun do1(): String {
    delay(1000)
    return "Work1"
}

suspend fun do2(): String {
    delay(1000)
    return "Work2"
}

suspend fun main() = coroutineScope {
    val time =  measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY){ do1() }
        val two = async (start = CoroutineStart.LAZY) { do2() }
        println("AWAIT: ${ one.await() + "_" + two.await() }")
    }
    println("Completed in $time ms")
}
/*
    결과 :
    AWAIT: Work1_Work2
    Completed in 2066 ms
 */