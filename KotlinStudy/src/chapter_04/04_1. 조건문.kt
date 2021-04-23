package chapter_04

fun main() {
    // 1) if문
    studyIfGrammar()

    // 2) else if문
    studyElseIfGrammar()

    // 3) when문
    studyWhenGrammer()

    // 4) when문(인자 x)
    studyWhenGrammarNotIndex()

    // 5) When(Any)
    availableCase()

}

fun studyIfGrammar() {
    val a = 12
    val b = 7

    // 블록과 함께 사용
    val max = if (a > b) {
        println("a 선택")
        a
    } else {
        println("b 선택")
        b
    }

    println(max)
}
/*
    결과 :
    a 선택
    12
*/

fun studyElseIfGrammar() {
    print("Enter the Score: ")
    val score = readLine()!!.toDouble() // Input Console
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score in 80.0..89.9) {
        // score >= 80.0 && score <= 89.9
        grade = 'B'
    } else if (score in 70.0..79.9) {
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}
/*
    결과 :
    Enter the Score: 89.9
    Score: 89.9, Grade: B
 */

fun studyWhenGrammer() {
    print("Enter the Score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }

    println("Score: $score, Grade: $grade")
}
/*
    결과 :
    Enter the Score: 85.7
    Score: 85.7, Grade: B
*/

fun studyWhenGrammarNotIndex() {
    print("Enter the Score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when {
        score >= 90.0 -> grade = 'A'
        score >= 80.0 -> grade = 'B'
        score >= 70.0 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }

    println("Score: $score, Grade: $grade")
}
/*
    결과 :
    Enter the Score: 82.4
    Score: 82.4, Grade: B
*/

fun availableCase() {
    cases("Hello") // String
    cases(1) // Int
    cases(System.currentTimeMillis()) // 현재 시각(ms) return Long Type
    cases(MyClass()) // Instance\
}

fun cases(obj: Any) {
    when(obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}
/*
    결과 :
    String: Hello
    Int: 1
    Long: 1619183627471
    Not a String
 */

class MyClass() {}
