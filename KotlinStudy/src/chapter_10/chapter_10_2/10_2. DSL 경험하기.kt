package chapter_10.chapter_10_2

val person = person {
    name = "Kildong"
    age = 40
    job {
        category = "IT"
        position = "Android Developer"
        extension = 1234
    }
}

data class Person(
    var name: String? = null,
    var age: Int? = null,
    var job: Job? = null
)

data class Job(
    var category: String? = null,
    var position: String? = null,
    var extension: Int? = null
)

fun Person.job(block: Job.() -> Unit): Job {
    val j = Job()
    j.block()
    return j
}

fun person(block: Person.() -> Unit): Person {
    val p = Person()
    p.block()
    p.apply {

    }
    return p
}

// 개선 코드
fun person2(block: Person.() -> Unit): Person = Person().apply(block)

fun job2(block: Job.() -> Unit): Job = Job().apply(block)