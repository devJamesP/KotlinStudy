package chapter_06

/*
lateinit의 제한
- var로 선언된 프로퍼티만 가능하다.
- 프로퍼티에 대한 게터와 세터를 사용할 수 없다.
 */

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kildong" // 3. 이 시점에서 초기화됨(지연 초기화)
    kildong.test()
    println("name = ${kildong.name}")
}
/*
    결과 :
    not initialized
    initialized
    name = kildong

 */


class Person {
    lateinit var name: String // 1. 지연 초기화를 위한 선언

    fun test() { // 2. 프로퍼티의 초기화 여부 판단
        if (!::name.isInitialized) {
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}