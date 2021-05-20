package chapter_10.chapter_10_2

data class Person1(
    var name: String? = null,
    var age: Int? = null,
    var job: Job1? = null
)

data class Job1(
    var category: String? = null,
    var position: String? = null,
    var extension: Int? = null
)

fun person1(block: Person1.() -> Unit): Person1 = Person1().apply(block)

fun Person1.job1(block: Job1.() -> Unit) {
    job = Job1().apply(block)
}

fun main() {
    val person1 = person1 { // 간단한 DSL이 적용된 생성 방법
        name = "Kildong"
        age = 40
        job1 {
            category = "IT"
            position = "Android Developer"
            extension = 1234
        }
    }
    println(person1)
}
/*
    결과 :
    Person1(name=Kildong, age=40, job=Job1(category=IT, position=Android Developer, extension=1234))
 */