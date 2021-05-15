package chapter_09.chapter_09_2

fun main() {
    // 불변형 List 사용
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")

    for(name in names) {
        println(name)
    }

    for (num in numbers) print(num)
    println()
}
/*
    결과 :
    one
    two
    three
    12345
 */