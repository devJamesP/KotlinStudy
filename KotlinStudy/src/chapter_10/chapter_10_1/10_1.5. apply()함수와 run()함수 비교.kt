package chapter_10.chapter_10_1

// inline fun <T, R> T.run(block: T.() -> R) : R = block()

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotiln")
    val returnObj = person.apply {
        name = "Sean"
        skills = "Java"
        "success" // 사용 되지 않음.
    }
    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        name = "Dooly"
        skills = "C#"
        "success" // 사용 되지 않음.
        // 마지막 표현식을 구성하지 않으면 Unit이 return
    }
    println(person)
    println("returnObj2: $returnObj2")
}
/*
    결과 :
    Person(name=Sean, skills=Java)
    returnObj: Person(name=Sean, skills=Java)
    Person(name=Dooly, skills=C#)
    returnObj2: success
 */