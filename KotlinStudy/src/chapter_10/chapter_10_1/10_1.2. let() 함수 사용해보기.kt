package chapter_10.chapter_10_1

// let() 함수는
// 이 함수를 호출한 객체를 인자로 받으므로 이를 사용하여 다른 메서드를 실행하거나
// 연산을 수행해야 하는 경우 사용할 수 있습니다.

// public inline fun <T, R> T.let(block: (T) -> (R)): R = block(this)

fun main() {
    val score: Int? = 32
    // var socre = null

    // 일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    // let함수를 사용해 null 검사를 제거
    fun checkScoreLet() {
        score?.let { println("Score: $it") } // 1
        val str = score.let { it.toString() } // 2
        println(str)
    }
    checkScore()
    checkScoreLet()
}
/*
    결과 :
    Score: 32
    Score: 32
    32

 */