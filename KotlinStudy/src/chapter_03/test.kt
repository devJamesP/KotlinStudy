package chapter_03

import java.util.concurrent.locks.ReentrantLock

// 공유 자원
var sharable2 = 1
fun main() {
    val reLock = ReentrantLock()

    lock2(reLock, ::criticalFunc2)

    println(sharable2)
}

fun criticalFunc2(): Int {
    for(i in 0..9) {
        sharable2 += 1
    }
    return sharable2
}

fun<T> lock2(reLock: ReentrantLock, body: ( ) -> T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}