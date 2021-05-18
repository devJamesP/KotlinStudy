package chapter_09.chapter_09_4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    /* 요소의 순환 */
    // forEach: 각 요소를 람다식으로 처리
    list.forEach{
        print("$it")
    }
    println()
    list.forEachIndexed { index, element ->
        println("index[$index] : $element")
    }

    println()
    // onEach: 각 요소를 람다식으로 처리 후 컬렉션으로 반환
    val returnedList = list.onEach {
        print(it)
    }
    println()

    val returnedMap = map.onEach{
        println("key: ${it.key}, value: ${it.value}")
    }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")
}
/*
    결과 :
    123456
    index[0] : 1
    index[1] : 2
    index[2] : 3
    index[3] : 4
    index[4] : 5
    index[5] : 6

    123456
    key: 11, value: Java
    key: 22, value: Kotlin
    key: 33, value: C++
    returnedList = [1, 2, 3, 4, 5, 6]
    returnedMap = {11=Java, 22=Kotlin, 33=C++}
 */