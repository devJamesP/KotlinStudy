package chapter_05

fun main() {
    // this로 현재 객체 참조
    val sean = Developer("Sean")
}
/*
    결과 :
    [Person] firstName: Sean, 10
    [Developer] firstNam: Sean, 10
    [Developer] firstNam: Sean
 */


open class Person {
    constructor(firstName: String) {
        println("[Person] firstName : $firstName")
    }
    constructor(firstName: String, age: Int) { // 호출 순서 : 3, 실행 순서 : 1
        println("[Person] firstName: $firstName, $age")
    }
}

class Developer: Person {
    constructor(firstName: String) : this(firstName, 10) { // 호출 순서 : 1, 실행 순서 : 3
        println("[Developer] firstNam: $firstName")
    }

    constructor(firstName: String, age: Int) : super(firstName, age) { // 호출 순서 : 2, 실행 순서 : 2
        println("[Developer] firstNam: $firstName, $age")
    }
}



