package chapter_09.chapter_09_4

fun main() {
    val list = listOf<Int>(1,2,3,4,5,6)

    // fold: 초깃값과 정해진 식에 따라 처음 요소부터 끝 요소에 적용하며 값을 생성
    println(list.fold(4){ total, next -> total + next}) // 4 + 1 + ... + 6 = 25
    println(list.fold(1) { total, next -> total * next}) // 1 * 1 * ... * 6 = 720

    // foldRight: fold와 같고 마지막 요소에서 처음 요소로 반대로 적용
    println(list.foldRight(4){ next, total -> total + next})
    println(list.foldRight(1) { next, total -> total * next})

    // reduce: fold와 동일하지만 초깃값을 사용하지 않음.
    println(list.reduce{ total, next -> total + next})
    println(list.reduceRight { next, total -> total + next})
}
/*
    결과 :
    25
    720
    25
    720
    21
    21
 */