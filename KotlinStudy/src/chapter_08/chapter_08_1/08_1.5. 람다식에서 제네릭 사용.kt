package chapter_08.chapter_08_1

fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}

fun main() {
    val result = add(2,3) {a, b -> a + b }
    println(result)
}
/*
람다식에서 제네릭 기본 연산은 불가함.
    결과 :
    5
 */