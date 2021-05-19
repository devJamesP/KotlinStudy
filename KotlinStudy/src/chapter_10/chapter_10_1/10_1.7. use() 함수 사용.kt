package chapter_10.chapter_10_1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

// use()함수를 사용하면 객체를 사용한 후 close() 함수를 자동적으로 호출해 닫아 줄 수 있습니다.
// 내부 구현을 보면 예외 오류 발생 여부와 상관 없이 항상 close()를 호출을 보장합니다.

//inline fun <T: Closeable?, R> T.use(block: (T) -> R): R

fun main() {
    PrintWriter(FileOutputStream("C:\\Temp\\output.txt")).use {
        it.println("hello")
    }

    val file = File("C:\\Temp\\output.txt")
    file.bufferedReader().use {
        println(it.readText())
    }

}