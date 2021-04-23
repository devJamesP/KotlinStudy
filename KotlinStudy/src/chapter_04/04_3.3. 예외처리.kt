package chapter_04

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    // 0으로 나누었을 때 예외 처리하기
    zeroDivideException()

    // 특정 예외 처리
    // 산술 연산에 대한 예외 처리 시(스택 추적 포함)
    arithmeticException()

}


fun zeroDivideException() {
    val a = 6
    val b = 0
    val c :Int

    try {
        c = a/b // Divded 0
    } catch(e: Exception) {
        println("Exception is handled :: $e")
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}
/*
    결과 :
    Exception is handled :: java.lang.ArithmeticException: / by zero
    finally 블록은 반드시 항상 실행됨
 */


fun arithmeticException() {
    val a = 6
    val b = 0
    val c :Int

    try {
        c = a/b // Divded 0
    } catch (e: ArithmeticException) {
        println("Exception is handled. ${e.message}")
        // 스택의 추적
        e.printStackTrace()
    }
}
/*
    결과 :
    java.lang.ArithmeticException: / by zero
	at chapter_04._04_3_3__예외처리Kt.arithmeticException(04_3.3. 예외처리.kt:38)
	at chapter_04._04_3_3__예외처리Kt.main(04_3.3. 예외처리.kt:12)
	at chapter_04._04_3_3__예외처리Kt.main(04_3.3. 예외처리.kt)
 */

