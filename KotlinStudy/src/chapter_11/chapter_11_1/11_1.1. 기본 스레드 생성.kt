package chapter_11.chapter_11_1

// 1. Thread 클래스를 상속받아 구현하기
class SimpleThread : Thread() {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

// 2. Runnable 인터페이스로부터 run() 메서드 구현하기
class SimpleRunnable : Runnable {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    // 익명 객체 형태의 표현식
    object : Thread() {
        override fun run() {
            println("Current Threads(object): ${Thread.currentThread()}")
        }
    }.start()

    // Runnable 전달하는 람다식
    Thread {
        println("Current Threads(lambda): ${Thread.currentThread()}")
    }.start()

}
/*
    결과 :
    (결과는 계속 바뀔 수 있습니다.)
    Current Threads: Thread[Thread-0,5,main]
    Current Threads: Thread[Thread-1,5,main]
    Current Threads(lambda): Thread[Thread-3,5,main]
    Current Threads(object): Thread[Thread-2,5,main]
 */