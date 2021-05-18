package chapter_07.chapter_07_3

class Point7(var x: Int = 0, var y: Int = 10) {
}

fun main() {
    val point = Point7()
    var result: Int = 0

    var t: Int = 1
    result += point.y
    // 결과 : 10 = 0 + 10을 result에 대입
}
