package chapter_08.chapter_08_2

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    // 1. 오름차순, 내림차순으로 정렬된 일반 배열로 변환
    val sortedNumbs = arr.sortedArray()
    println("ASC: " + sortedNumbs.contentToString())

    val sortedNumbsDesc = arr.sortedArrayDescending()
    println("DESC: " + sortedNumbsDesc.contentToString())

    // 2. 원본 배열에 대한 정렬
    arr.sort(1, 3) // sort(fromIndex, toIndex)
    println("ORI: " + arr.contentToString())
    arr.sortDescending()
    println("ORI: " + arr.contentToString())

    // 3. List로 반환
    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: $listSorted")
    println("LST: $listDesc")

    // 4. SortBy를 이용한 특정 표현식에 따른 정렬
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(items.contentToString())
}
/*
    결과 :
    ASC: [1, 2, 3, 4, 5, 8, 9]
    DESC: [9, 8, 5, 4, 3, 2, 1]
    ORI: [8, 3, 4, 2, 5, 9, 1]
    ORI: [9, 8, 5, 4, 3, 2, 1]
    LST: [1, 2, 3, 4, 5, 8, 9]
    LST: [9, 8, 5, 4, 3, 2, 1]
    [Po, Dog, Cat, Lion, Kangaroo]
 */