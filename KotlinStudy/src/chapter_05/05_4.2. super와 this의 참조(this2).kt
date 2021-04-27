package chapter_05

fun main() {
    // 주 생성자와 부 생성자 사용
    val p1 = Person2("Kildong", 30) // 1 -> 2 호출, 3 -> 4 -> 5 실행
    println()
    val p2 = Person2("Dooly") // 2 호출 3 -> 4 실행
}
/*
    결과 :
    [Secondary Constructor] Parameter
    [Primary Constructor] Parameter
    [Primary] Person fName: Kildong
    [init] Person init block
    [Secondary Constructor] Body: Kildong, 30

    [Primary Constructor] Parameter
    [Primary] Person fName: Dooly
    [init] Person init block
 */
class Person2(firstName: String,
    out: Unit = println("[Primary Constructor] Parameter")) { // 2. 주 생성자
    val fName = println("[Primary] Person fName: $firstName") // 3. 프로퍼티 할당

    init {
        println("[init] Person init block") // 4. 초기화 블록
    }

    // 1. 부 생성자
    constructor(firstName: String, age: Int,
    out: Unit = println("[Secondary Constructor] Parameter")): this(firstName) {
        println("[Secondary Constructor] Body: $firstName, $age") // 5. 부 생성자 본문
    }
 }

