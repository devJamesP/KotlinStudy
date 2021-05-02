    package chapter_06

    class Person1(val name: String, val age: Int)

    fun main() {
        var isPersonInstantiated: Boolean = false // 초기화 확인 용도

        val person: Person1 by lazy { // 1. lazy를 사용한 person1 객체의 지연 초기화
            isPersonInstantiated = true
            Person1("Kim", 23)
        }

        val personDelegate = lazy { Person1("Hong", 40) } // 3. 위임 변수를 사용한 초기화

        println("person Init: $isPersonInstantiated")
        println("personDelegate Init: ${personDelegate.isInitialized()}")

        println("person.name = ${person.name}") // 4. 이 시점에서 초기화
        println("personDelegate.value.name = ${personDelegate.value.name}") // 5. 이 시점에서 초기화

        println("person Init: $isPersonInstantiated")
        println("personDelegate Init: ${personDelegate.isInitialized()}")
    }
    /*
        결과 :
        person Init: false
        personDelegate Init: false

        person.name = Kim
        personDelegate.value.name = Hong

        person Init: true
        personDelegate Init: true

     */