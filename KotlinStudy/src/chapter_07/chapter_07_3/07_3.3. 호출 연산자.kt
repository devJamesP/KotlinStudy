package chapter_07.chapter_07_3

class Point3(var x: Int = 0, var y: Int = 10) {
    // 호출 연산자 오버로딩
    operator fun invoke(value: String) = println(value)
}

fun main() {
    var point = Point3()
    // invoke는 생략 할 수 있음.
    point.invoke("invoke : Do something for me!")
    point("Skip invoke : Do something for me!")
}
/*
    결과 :
    invoke : Do something for me!
    Skip invoke : Do something for me!
 */