package chapter_09.chapter_09_3

import java.util.*
import kotlin.collections.HashMap

fun main() {
    // java.util.HashMap 사용
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "Hello", 2 to "World")
    println("hashMap = $hashMap")

    // java.util.SortedMap 사용
    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap")

    // java.util.LinkedHashMap 사용
    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer", 2 to "Mouse")
    println("LinkedHash = $linkedHash")
}
/*
    결과 :
    hashMap = {1=Hello, 2=World}
    sortedMap = {1=Apple, 2=Banana}
    LinkedHash = {1=Computer, 2=Mouse}
 */