package chapter_09.chapter_09_2

fun main() {
    var names: List<String> = listOf("one", "two", "three", "three")

    println(names.size) // List 크기
    println(names.get(0)) // 해당 인덱스의 요소 가져오기
    println(names.indexOf("three")) // 해당 요소의 첫번째 인덱스 가져오기
    println(names.lastIndexOf("three")) // 해당 요소의 마지막 인덱스 가져오기
    println(names.contains("two")) // 포함 여부 확인 후 포함되어 있으면 true 반환
    println(names.subList(0, 2)) // 특정 인덱스의 from 과 to 범위에 있는 요소 목록을 반환
}
/*
    결과 :
    4
    one
    2
    3
    true
    [one, two]
 */