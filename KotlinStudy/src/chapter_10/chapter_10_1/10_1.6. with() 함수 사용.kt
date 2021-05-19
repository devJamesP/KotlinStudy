package chapter_10.chapter_10_1

// let()함수와 with() 함수의 표현을 병합하면 run() 함수로 표현 가능

// inline fun<T, R> with(receiver: T, block: T.() -> R): R = receiver.block()

fun main() {
    data class User(var name: String, var skills: String)
    val user = User("Kildong", "default")

    val result = with(user) {
        this.name = "Kotlin"
        this.skills = "Kildong@example.com"
    }
    println(user)
    println("result: $result")
}
/*
    결과 :
    kotlin.Unit
    result: kotlin.Unit
 */