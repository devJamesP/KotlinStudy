package chapter_03

import java.util.concurrent.locks.ReentrantLock

// JAVA - Lock, ReentrantLock
/*
fun lockCode() {
    Lock lock = new ReentrantLock()
    lock.lock(); // 잠금
    try {
        // 보호할 임계 영역의 코드
        // 수행할 작업
    } finally {
        lock.unlock(); // 해제
    }
}
*/

var sharable = 1 // 보호가 필요한 공유 자원

fun main() {
    val reLock = ReentrantLock()

    // 표현식이 동일한 코드
    lock(reLock, { creticalFunc() })
    lock(reLock) { creticalFunc() }
    lock(reLock, ::creticalFunc)

    println(sharable)
}

fun creticalFunc() {
    // 공유 자원 접근 코드
    sharable += 1
}

// 특정 함수(body)를 동기화 하는 고차 함수 형태
fun <T> lock(reLock: ReentrantLock, body: ( ) -> T): T {
    reLock.lock( )
    try {
        return body( )
    } finally {
        reLock.unlock()
    }
}

// 실행결과 :: 4











