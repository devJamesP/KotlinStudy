package chapter_10.chapter_10_3

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val path = "C:\\Temp\\hello.txt" // 파일을 생성할 경로를 지정
    val text = "안녕하세요! Hello World!"

    try {
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch(e: IOException) {
        e.printStackTrace()
    }
}