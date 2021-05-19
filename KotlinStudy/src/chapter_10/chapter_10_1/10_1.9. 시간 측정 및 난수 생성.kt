package chapter_10.chapter_10_1

import kotlin.random.Random
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

/*
public inline fun measureTimeMillis(block:() -> Unit): Long {
    val start = System.currentTimeMills()
    block()
    return System.currentTimeMills() - start
}

public inline fun measureNanoTimes(block: () -> Unit): Long {
    val start = System.nanoTime()
    block()
    return System.nanoTime() - start
}
 */

fun main() {
    val excutionTime = measureNanoTime {
        // 측정할 작업 코드
        val n = 1_000_000_000
        var result = 0
        for(i in 0 until n) {
            result = i
        }
    }
    println("Excution Time = $excutionTime")

    // 난수 생성
    val number = Random.nextInt(21) // 숫자는 난수 발생 범위
    println(number)
}
/*
    결과 :
    Excution Time = 1867863
    15
 */


