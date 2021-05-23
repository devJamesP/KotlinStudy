package chapter_11.chapter_11_4

import kotlin.concurrent.thread

@Volatile private var running = false
private var count = 0

fun start() {
    running = true
    thread(start = true) {
        while(running) println("${Thread.currentThread()}, count: ${count++}")
    }
}

fun stop() { running = false }

fun main() {
    start()
    start()
    Thread.sleep(1)
    stop() // 여기서 상태를 바꿈
}
/*
@Volatile는 값 쓰기에 대해서는 보장하지 않음.
    결과 :
    Thread[Thread-0,5,main], count: 0
    Thread[Thread-1,5,main], count: 1
    Thread[Thread-0,5,main], count: 2
    Thread[Thread-1,5,main], count: 3
    ...
 */