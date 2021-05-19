package chapter_10.chapter_10_1

// 특정 객체를 초기화 하는데 사용합니다.

// inline fun <T> T.apply(block: T.() -> Unit): T { block(); return this}

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("Kildong", "Kotiln")
    person.apply {
        skills = "Swift" // 여기서 this는 person 객체를 가리킴
    }
    println(person)

    val returnObj = person.apply {
        name = "Sean" // this는 생략할 수 있음.
        skills = "Java" // this 없이 객체의 멤버에 여러 번 접근
    }
    println(person)
    println(returnObj)
}
/*
    결과 :
    Person(name=Kildong, skills=Swift)
    Person(name=Sean, skills=Java)
    Person(name=Sean, skills=Java)
 */