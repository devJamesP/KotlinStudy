package chapter_08.chapter_08_2

import java.util.Arrays

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr: ${arr.contentToString()}") // Arrays.toString()은 배열의 내용을 문자열로 변환 -> contentToString() 대체
    println("size: ${arr.size}") // size는 배열의 크기를 나타냄
    println("sum(): ${arr.sum()}") // sum() 메서드는 배열의 합을 계산
    // 게터에 의한 접근과 대괄호 연산자 표기법
    println(arr.get(2))
    println(arr[2])

    // 세터에 의한 값의 설정
    arr.set(2, 7)
    arr[0] = 8
    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    // 루프를 통한 배열 요소의 접근
    for (i in 0..arr.size - 1) {
        println("arr[$i] = ${arr[i]}")
    }
}
/*
    결과 :
    arr: [1, 2, 3, 4, 5]
    size: 5
    sum(): 15
    3
    3
    size: 5, arr[0]: 8, arr[2]: 7
    arr[0] = 8
    arr[1] = 2
    arr[2] = 7
    arr[3] = 4
    arr[4] = 5
 */