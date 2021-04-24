package chapter_04

fun main() {
    // 기본 반복문 실습
    getStarTriangle()

    // 반복문을 통한 짝수, 홀수의 합
    sumOddEvenNumber()

    // while문을 통한 팩토리얼 계산
    whileFactorial()

    // do ~ while문
    studyDoWhile()
}



fun getStarTriangle() {
    print("Enter the lines: ")
    val n = readLine()!!.toInt()
    for(line in 1..n) {
        for(space in 1..n - line) { print(" ") }
        for(star in 1..(2*line-1)) { print("*") }
        println()
    }
}
/*
    결과 :
        *
       ***
      *****
     *******
    *********
*/

fun sumOddEvenNumber() {
    var total : Int = 0
    for (num in 1..100 step 2) total += num
    println("Odd total: $total")

    for(num in 0..99 step 2) total += num
    println("Even total: $total")
}
/*
    결과 :
    Odd total: 2500
    Even total: 4950
 */

fun whileFactorial() {
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while(number > 0) {
        factorial *= number--
    }

    println("Factorial: $factorial")
}
/*
    결과 :
    Enter the number: 5
    Factorial: 120
*/

fun studyDoWhile() {
    do {
        print("Enter an integer: ")
        val input = readLine()!!.toInt()

        for(i in 0 until input) {
            for(j in 0 until input) print((i + j) % input + 1)
            println()
        }
    } while (input != 0)
}
/*
    결과 :
    3
    123
    231
    312
*/