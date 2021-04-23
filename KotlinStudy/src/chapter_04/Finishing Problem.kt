package chapter_04

fun main() {

    // str1변수에 null 저장시 -1반환, 아니면 length반환
    var str1: String? = "Hello"
    var len = str1?.length ?: -1
    println(len)

    // 54321 순서대로 출력하는 코드
    for(num in 5 downTo 1) {
        print(num)
    }

    print("Enter the number: ")
    val x = readLine()

    // when문과 범위 지정자를 사용하여 10~20 사이의 값이 아닌 경우 블록을 실행하는 코드 작성
    when(x) {
        in 10..20 -> { println("해당 블록 실행") }
    }
}