package chapter_07.chapter_07_3

class Point4(var x: Int = 0, var y: Int = 10) {
    val a = arrayOf(1,2,3,4)
    // 인덱스 접근 연산자
    operator fun Point4.unaryMinus() = Point4(-x, -y)
}



fun main() {
    var point = Point4()

    // setter -> [ ]연산자로 입력.
    // 1, 2, 3, 4... -> 1, 2, 3, 13
    point.a.set(3, 13)
    point.a[3] = 13

    // getter -> [ ]연산자로 출력.
    println("${point.a.get(3)}")
    println("${point.a[3]}")


}
/*
    결과 :
    13
    13
 */