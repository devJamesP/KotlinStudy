package chapter_08.chapter_08_2

fun main() {
    val numbers = arrayOf(1, 2, 3)
    val strs = arrayOf("one", "two", "three")
    val simpleArray = arrayOf(numbers, strs) // 2차원 배열
    simpleArray.forEach { println(it) }

    val flattenSimpleArray = simpleArray.flatten() // 단일 배열로 변환하기
    println(flattenSimpleArray)
}
/*
    결과 :
    [Ljava.lang.Integer;@34ce8af7
    [Ljava.lang.String;@b684286
    [1, 2, 3, one, two, three]
 */