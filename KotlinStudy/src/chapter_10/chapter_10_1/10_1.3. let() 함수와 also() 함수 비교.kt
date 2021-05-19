package chapter_10.chapter_10_1

// also는  음...?

// inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }

fun main() {
    data class Person(var name: String, var skills: String)
    val person = Person("Kildong", "Kotlin")
    val a = person.let {
        it.skills = "Android"
        "success" // 마지막 문장을 결과로 반환
    }
    println(person)
    println("a: $a") // String

    val b = person.also {
        it.skills = "Java"
        "success" // 마지막 문장은 사용하지 않음
    }
    println(person)
    println("b: $b")
}
/*
    결과 :
    Person(name=Kildong, skills=Android)
    a: success
    Person(name=Kildong, skills=Java)
    b: Person(name=Kildong, skills=Java)
 */