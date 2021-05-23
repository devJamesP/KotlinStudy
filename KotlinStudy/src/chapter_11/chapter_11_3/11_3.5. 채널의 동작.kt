package chapter_11.chapter_11_3

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val channel  = Channel<Int>()
    launch {
        // 여기에 다량의 CPU 연산 작업이나 비동기 로직을 둘 수 있음
        for(x in 1..5) channel.send(x * x)
        channel.close() // 모두 보내고 닫기 명시
    }

    for (element in channel) println(element)
//    repeat(5) { println(channel.receive())}
    println("Done!")
}
/*
    결과 :
    1
    4
    9
    16
    25
    Done!
 */