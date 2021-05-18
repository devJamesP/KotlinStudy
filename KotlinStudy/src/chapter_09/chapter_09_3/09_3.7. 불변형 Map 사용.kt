package chapter_09.chapter_09_3

fun main() {
    // 불변형 Map의 선언 및 초기화
    val langMap: Map<Int, String> = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")
    for((key, value) in langMap) { // 키와 값의 쌍을 출력
        println("key = $key, value = $value")
    }
    println("langMap[22] = ${langMap[22]}") // 키 22에 대한 값 출력
    println("langMap[22] = ${langMap.get(22)}") // 위와 동일한 표현
    println("langMap.keys = ${langMap.keys}") // 맵의 모든 키 출력
}
/*
    결과 :
    key = 11, value = Java
    key = 22, value = Kotlin
    key = 33, value = C++
    langMap[22] = Kotlin
    langMap[22] = Kotlin
    langMap.keys = [11, 22, 33]
 */