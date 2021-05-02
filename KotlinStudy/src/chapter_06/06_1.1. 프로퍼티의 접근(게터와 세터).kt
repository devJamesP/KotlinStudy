package chapter_06

/*
코틀린에서는 프로퍼티의 게터와 세터가 자동으로 만들어집니다.
 */

fun main() {
    val user = User(1, "Sean", 30)

    val name = user.name // 게터에 의한 값 획득

    user.age = 41 // 세터에 의한 값 지정

    println("name: $name, age: ${user.age}")
}

class User(val id: Int, var name: String, var age: Int)

/*
    결과 :
    name: Sean, age: 41
 */