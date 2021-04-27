package chapter_05

fun main() {
    // Inner Class에서 외부 클래스 접근
    val c1 = Child()
    c1.Inside().test() // Inner 클래스 Inside의 메서드 test() 실행
}

/*
    결과 :
    Inside Class f()
    Childe Class f()
    Base Class f()
    [Inside] super@Child.x: 1
 */
open class Base {
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child: Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Childe Class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f() // 1. 현재 이너 클래스의 f() 접근
            Child().f() // 2. 바로 바깥 클래스 f() 접근
            super@Child.f() // 3. Child의 상위 클래스인 Base 클래스의 f() 접근
            println("[Inside] super@Child.x: ${super@Child.x}") // 4. Base의 x접근
        }
    }
}

