package chapter_09.chapter_09_5

fun main() {
    // 시드 값 1을 시작으로 1씩 증가하는 시퀀스 정의
    val nums: Sequence<Int> = generateSequence(1) { it + 1 }

    // take()를 사용해 원하는 요소 개수만큼 획득하고 toList()를 사용해 List 컬렉션으로 반환
    println(nums.take(10).toList())

    // map, filter 연산 사용
    val squares = generateSequence(1) { it + 1}.map { it * it }
    println(squares.take(10).toList())

    val oddSquares = squares.filter { it % 2 != 0 }
    println(oddSquares.take(5).toList())
}
/*
    결과 :
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */