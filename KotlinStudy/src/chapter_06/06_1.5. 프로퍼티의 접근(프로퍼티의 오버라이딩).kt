package chapter_06

fun main() {
    val second = Second()
    println(second.x)   // 5. 오버라이딩된 두 번쨰 클래스 객체의 x
    println(second.y)   // 상위 클래스로부터 상속받은 값
}
/*
    결과 :
    Second x
    3
    0
 */

open class First {
    open val x: Int = 0 // 1. 오버라이딩 가능
        get() {
            println("First x")
            return field
        }
    val y: Int = 0 // 2. open 키워드가 없으면 final 프로퍼티
}

class Second : First() {
    // 상위 클래스 val -> 하위 클래스 var 바꿀 수 있음(반대는 불가)
    override val x: Int = 0 // 3. 상위 클래스와 구현부가 다르게 오버라이딩됨
        get() {
            println("Second x")
            return field + 3
        }
    // override val y: Int = 0 // 4. 오류! 오버라이딩 불가
}

