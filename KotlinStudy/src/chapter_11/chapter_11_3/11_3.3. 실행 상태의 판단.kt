package chapter_11.chapter_11_3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val job = GlobalScope.launch {
        var nextPrintTime = startTime
        var i = 0
//        while(isActive) { //  취소 시그널을 받아 루프를 중단하려면 다음과 같이 수정
        while(i < 5) { // 조건을 계산에 의해 반복
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("I`m sleeping ${i++}")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L)
    println("main: I`m tired of wating!")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}
/*
    결과 :
    I`m sleeping 0
    I`m sleeping 1
    I`m sleeping 2
    main: I`m tired of wating!
    I`m sleeping 3
    I`m sleeping 4
    main: Now I can quit.
 */