package chapter_06

fun main() {
    val test = LazyTest() // 1
    test.flow() // 3
}
/*
    결과 :
    init block
    not initialized
    lazy initialized
    subject one: Kotlin Programming
    subject two: Kotlin Programming
 */

class LazyTest {
    init {
        println("init block") // 2
    }

    val subject by lazy {
        println("lazy initialized") // 6
        "Kotlin Programming"
    }
    fun flow() {
        println("not initialized") // 4
        println("subject one: $subject") // 5. 최초 초기화 시점
        println("subject two: $subject") // 8. 이미 초기화된 값 사용
    }
}