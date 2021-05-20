package chapter_10.chapter_10_3

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.Exception

fun main() {
    val outString: String = "안녕하세요!\\Hello\r\nWorld!" // 1. 문자열의 구성

    val path = "C:\\Temp\\testfile.txt"

    val file = File(path)

    // PrintWriter
    val printWriter = PrintWriter(file)

    printWriter.println(outString)
    printWriter.close()

    // 개선 코드
    printWriter.use {
        it.println(outString)
    }

    // BufferedWriter
    File(path).bufferedWriter().use { it.write(outString)}

    // writeText() 사용
    file.writeText(outString)
    file.appendText("\nDo great work!") // 파일에 문자열을 추가

    // FileWriter 사용하기
    val writer = FileWriter(path, true) // 인자: 경로, append 여부
    try {
        writer.write(outString)
    } catch (e: Exception) {
        // 오류 발생!
    } finally {
        writer.close()
    }

    // 개선 코드
    FileWriter(path, true).use { it.write(outString) }

}