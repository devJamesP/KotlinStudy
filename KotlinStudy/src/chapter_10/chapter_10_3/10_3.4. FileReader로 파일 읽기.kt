package chapter_10.chapter_10_3

import java.io.BufferedReader
import java.io.FileReader


fun main() {
    val path = "C:\\Temp\\Over the Rainbow.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    } catch(e : Exception) {
        println(e.message)
    }

}
/*
    결과 :
    Somewhere over the rainbow, way up high, there`s a land that I heard of once in a lullaby.
    무지개 너머 저 어딘가에, 아주 높은 곳에, 자장가에서 한번 들었던 나라가 있어요.

    Somewhere over the rainbow, skies are blue.
    무지개 너머 저 어딘가에, 하늘은 파래요.

    and the dreams that you dare to dream really do come true.
    그리고 당신이 감히 꿈꾸는 그 꿈들이 정말로 이루어져요.

 */