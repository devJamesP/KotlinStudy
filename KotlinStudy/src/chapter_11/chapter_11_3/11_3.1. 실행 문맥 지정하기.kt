package chapter_11.chapter_11_3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val jobs = arrayListOf<Job>()
    jobs += launch(Dispatchers.Unconfined) { // 메인 스레드에서 작업
        println("Unconfined:\t\t ${Thread.currentThread().name}")
    }
    jobs += launch(coroutineContext) { // 부모의 문맥, 여기서는 runBlocking의 문맥
        println("coroutineContext:\t ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.Default) { // 디스패처의 기본값
        println("Default:\t\t ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.IO) { // 입출력 중심의 문맥
        println("IO:\t\t ${Thread.currentThread().name}")
    }
    jobs += launch { // 아무런 인자가 없을 때
        println("main runBlocking:\t ${Thread.currentThread().name}")
    }
    jobs += launch(newSingleThreadContext("MyThread")) { // 새로운 스레드를 생성
        println("MyThread:\t\t ${Thread.currentThread().name}")
    }

    jobs.forEach{
        it.join()
    }
}
/*
    결과 :
    Unconfined:		 main
    Default:		 DefaultDispatcher-worker-1
    IO:		 DefaultDispatcher-worker-2
    MyThread:		 MyThread
    coroutineContext:	 main
    main runBlocking:	 main
 */