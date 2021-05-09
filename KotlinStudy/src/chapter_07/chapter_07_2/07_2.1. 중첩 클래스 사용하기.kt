package chapter_07.chapter_07_2

class Outer {
    val ov = 5

    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv" // 외부의 ov에는 접근 불가
        fun t() = println("$test")
    }

    fun outside() {
        val msg = Nested().greeting() // 객체 생성 없이 중첩 클래스의 메서드 접근
        println("[Outer]: $msg, ${Nested().nv}" ) // 중첩 클래스의 프로퍼티 접근
    }

    companion object {
        const val test = "korea"
    }
}

fun main() {
    // static처럼 객체 생성 없이 사용
    val output = Outer.Nested().greeting()
    println(output)

    // Outer.outside() // 오류! 외부 클래스의 경우는 객체를 생성해야 함.
    val outer = Outer()
    outer.outside()
}
/*
    결과 :
    [Nested] Hello ! 10
    [Outer]: [Nested] Hello ! 10, 10

 */
