package chapter_11.chapter_11_3

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

// 생산자를 위한 함수 생성
fun CoroutineScope.producer(): ReceiveChannel<Int> = produce {
    var total: Int = 0
    for(x in 1..5) {
        total += x
        send(total)
    }
}

fun main() = runBlocking {
    val result = producer() // 값의 생산
    result.consumeEach { print("$it")} // 소비자 루틴 구성
}