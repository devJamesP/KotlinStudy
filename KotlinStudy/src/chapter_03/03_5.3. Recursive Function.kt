package chapter_03

import java.math.BigInteger

fun main() {
    val number = 4
    val result: Long = factorial(number)

    // 팩토리얼 함수
    println("Factorial: $number -> $result")
/*
    결과 :
    Factorial: 4 -> 24
*/

    val number2 = 5
    println("tailFactorial: $number -> ${tailFactorial(number2)}")
/*
    결과 :
    tailFactorial: 5 -> 120
*/

    // 피보나치 함수
    val n = 100
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(tailFibonachi(n, first, second))
/*
    결과 : 354224848179261915075
*/

}

// 팩토리얼 함수
fun factorial(number: Int): Long {
    if (number <= 1) return 1
    return number * factorial(number - 1)
}

// 팩토리얼 함수 (꼬리 재귀 함수 : 오버스택플로우 방지)
tailrec fun tailFactorial(n : Int, run: Int = 1) : Long {
    return if (n == 1) run.toLong() else tailFactorial(n-1, run*n)
}

// 피보나치 수열
fun fibonachi(n: Int, a: Long, b: Long): Long {
    return if (n == 0) b else fibonachi(n-1, a+b, a)
}

// 피보나치 수열 (꼬리 재귀 함수)
fun tailFibonachi(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else tailFibonachi(n-1, b, a+b)
}