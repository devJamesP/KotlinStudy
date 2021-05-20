package chapter_10.chapter_10_3

import java.io.*
import java.nio.Buffer

fun main() {
    val path = "C:\\Temp\\Over the Rainbow.txt"

    // 단순 변환
    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val inputStreamReader = InputStreamReader(inputStream)
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(inputStreamReader)
    try {
        line = br.readLine()
        while(line != null) {
            sb.append("$line\n")
            line = br.readLine()
        }
        println(sb)
    } catch (e: IOException) {

    } finally {
        br.close()
    }

    // 단순 변환 -> 개선 코드
    val file2 = File(path)
    val inputStream2: InputStream = file.inputStream()
    val text = inputStream2.bufferedReader( ).use { it.readText() }
    println(text)

    // 개선 코드 2
    val bufferedReader: BufferedReader = File(path).bufferedReader( )
    val inputString = bufferedReader.use { it.readText() }
    println(inputString)

    val bufferedReader2 = File(path).bufferedReader()
    val lineList = mutableListOf<String>()
    bufferedReader2.useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach { println("> $it")}

    // 개선 코드 3
    val lineList2 = mutableListOf<String>()
    File(path).useLines { lines -> lines.forEach { lineList2.add(it) } }
    lineList2.forEach{ println("> $it")}
}
/*
    결과 :
    Somewhere over the rainbow, way up high, there`s a land that I heard of once in a lullaby.
    무지개 너머 저 어딘가에, 아주 높은 곳에, 자장가에서 한번 들었던 나라가 있어요.

    Somewhere over the rainbow, skies are blue.
    무지개 너머 저 어딘가에, 하늘은 파래요.

    and the dreams that you dare to dream really do come true.
    그리고 당신이 감히 꿈꾸는 그 꿈들이 정말로 이루어져요.

    Somewhere over the rainbow, way up high, there`s a land that I heard of once in a lullaby.
    무지개 너머 저 어딘가에, 아주 높은 곳에, 자장가에서 한번 들었던 나라가 있어요.

    Somewhere over the rainbow, skies are blue.
    무지개 너머 저 어딘가에, 하늘은 파래요.

    and the dreams that you dare to dream really do come true.
    그리고 당신이 감히 꿈꾸는 그 꿈들이 정말로 이루어져요.
    Somewhere over the rainbow, way up high, there`s a land that I heard of once in a lullaby.
    무지개 너머 저 어딘가에, 아주 높은 곳에, 자장가에서 한번 들었던 나라가 있어요.

    Somewhere over the rainbow, skies are blue.
    무지개 너머 저 어딘가에, 하늘은 파래요.

    and the dreams that you dare to dream really do come true.
    그리고 당신이 감히 꿈꾸는 그 꿈들이 정말로 이루어져요.
    > Somewhere over the rainbow, way up high, there`s a land that I heard of once in a lullaby.
    > 무지개 너머 저 어딘가에, 아주 높은 곳에, 자장가에서 한번 들었던 나라가 있어요.
    >
    > Somewhere over the rainbow, skies are blue.
    > 무지개 너머 저 어딘가에, 하늘은 파래요.
    >
    > and the dreams that you dare to dream really do come true.
    > 그리고 당신이 감히 꿈꾸는 그 꿈들이 정말로 이루어져요.
    > Somewhere over the rainbow, way up high, there`s a land that I heard of once in a lullaby.
    > 무지개 너머 저 어딘가에, 아주 높은 곳에, 자장가에서 한번 들었던 나라가 있어요.
    >
    > Somewhere over the rainbow, skies are blue.
    > 무지개 너머 저 어딘가에, 하늘은 파래요.
    >
    > and the dreams that you dare to dream really do come true.
    > 그리고 당신이 감히 꿈꾸는 그 꿈들이 정말로 이루어져요.

 */