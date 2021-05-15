package chapter_09.chapter_09_2

fun main() {
    val names: List<String> = listOf("one", "two", "three") // 불변형 List 초기화
    val mutableNames = names.toMutableList() // 새로운 가변형 List가 만들어짐
    mutableNames.add("four") // 가변형 List에 하나의 요소 추가
    println(mutableNames)
}