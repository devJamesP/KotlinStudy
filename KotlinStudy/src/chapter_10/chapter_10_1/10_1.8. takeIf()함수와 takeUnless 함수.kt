package chapter_10.chapter_10_1

// takeIf()함수는 람다식이 true이면 결과를 반환하고, takeUnless() 함수는 람다식이 false이면 결과를 반환합니다.

/*
 public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T? =
     if (predicate(this)) this else null

 public inline fun <T> T.takeUnless(predicate: (T) -> Boolean): T? =
     if (!predicate(this)) this else null
*/

data class SomeObject(val status: Boolean)

fun doThis() {
}

fun main() {
    val someObject = SomeObject(true)
    // 기존 코드
    if (someObject != null && someObject.status) {
        doThis()
    }

    // 개선 코드
    if (someObject?.status == true) {
        doThis()
    }

    // 개선 코드
    someObject?.takeIf { it.status }?.also {
        doThis()
    }

    val input = "Kotlin"
    val keyword = "in"

    // 입력 문자열에 키워드가 있으면 인덱스를 반환하는 함수를 takeIf() 함수를 사용하여 구현

    // 기존 코드
    if (keyword.length >= 0) {
        input.indexOf(keyword) // 해당 키워드가 시작되는 인덱스 반환
    } else {
        error("keyword not found")
    }

    // 개선 코드
    val takeIfInput = input.indexOf((keyword).takeIf{ it.length >= 0 } ?: error("keyword not found"))

    // takeUnless() 함수를 사용하여 구현
    val takeUnlessInput = input.indexOf((keyword).takeUnless { it.length < 0 } ?: error("keyword not found"))

    println(takeIfInput)
    println(takeUnlessInput)
}
/*
    결과 :
    4
    4
 */