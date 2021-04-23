package chapter_04

import java.lang.Exception

fun main() {
    // throw를 사용해 예외 발생시키기
    throwException()

    // 사용자 정의 예외 클래스 객체 생성 및 활용
    customRunException()

}

fun throwException() {
    var amount = 600
    try {
        amount -= 100
        checkAmount(amount)
    } catch (e: Exception) {
        println(e.message)
    }
    println("amount: $amount")
}

fun checkAmount(amount: Int) {
    if (amount < 1000)
        throw Exception("잔고가 $amount 으로 1000 이하입니다.")
}
/*
    결과 :
    잔고가 500 으로 1000 이하입니다.
    amount: 500
*/


// 사용자 예외 클래스 정의
class InvalidNameException(message: String) : Exception(message) // 1. 사용자 예외 클래스

fun customRunException() {
    val name = "JamesPark_H123" // 2. 숫자가 포함된 이름
    try {
        validateName(name)
    } catch (e: InvalidNameException) { // 3. 숫자가 포함된 예외 처리
        println(e.message)
    } catch (e: Exception) { // 기타 예외 처리
        println(e.message)
    }
}

private fun validateName(name: String) { // 4. 이름에 숫자가 포함되어 있으면 예외 발생시킴
    if (name.matches(Regex(".*\\d+.*")))
        throw InvalidNameException("Your name : $name :: contains number")
}
/*
    결과 :
    Your name : JamesPark_H123 :: contains number
*/


fun testProblem() {

}