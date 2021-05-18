package chapter_09.chapter_09_5

fun main() {
    // 디버깅 해보면
    // 처음 seed 값은 1 to 1으로 Pair함수
    // 다음 실행 함수에서는 second to first + second 생성 (1, 2)
    // map함수 적용, 이건 먼소리인지 모르겠다....
    val fibonacci = generateSequence(1 to 1) { it.second to it.first + it.second }
        .map { it.first }
    println(fibonacci.take(10).toList())
}
/*
    결과 :
    [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
 */