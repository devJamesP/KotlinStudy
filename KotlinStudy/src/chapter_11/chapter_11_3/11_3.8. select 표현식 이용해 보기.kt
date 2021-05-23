package chapter_11.chapter_11_3

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select
import kotlin.random.Random

fun main() = runBlocking {
    val routine1 = GlobalScope.produce {
        delay(Random(0).nextInt(1000).toLong())
        send("A")
    }
    val routine2 = GlobalScope.produce {
        delay(Random(0).nextInt(1000).toLong())
        send("B")
    }
    val result = select<String> { // 먼저 수행된 것을 받게 된다.
        routine1.onReceive { result -> result }
        routine2.onReceive { result -> result }
    }
    println("Result was $result")
}
/*
    결과 :
    Result was A 또는 B

 */