package chapter_07.chapter_07_2

// 실드 클래스를 선언하는 첫 번째 방법
sealed class Result {
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

class Status: Result()
class Inside: Result.Success("Status")

// 실드 클래스를 선언하는 두 번쨰 방법
sealed class Result2

open class Success2(val message: String): Result2()
class Error2(val code: Int,val message: String): Result2()

class Status2: Result2()
class Inside2: Success2("Status")

fun main() {
    // Success에 대한 객체 생성
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}

// 상태를 검사하기 위한 함수
fun eval(result: Result): String = when(result) {
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
    // 모든 조건을 가지므로 else가 필요 없음.
}