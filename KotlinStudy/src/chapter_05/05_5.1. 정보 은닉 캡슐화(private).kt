package chapter_05

fun main() {
    // private 가시성 지시자 예제(Visiblity Modifier)
    val pc = PrivateClass() // 생성 가능
//    pc.i // 접근 불가
//    pc.privateFunc() // 접근 불가

}

fun topFunction() {
    val tpc = PrivateClass() // 객체 생성 가능
}

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1 // 접근 허용
    }
    fun access() {
        privateFunc() // 접근 허용
    }
}

class OtherClass {
    // val opc = PrivateClass() // 불가 - 프로퍼티 opc는 private가 되어야 접근 가능
    fun test() {
        val pc = PrivateClass()
    }
}