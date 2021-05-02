package chapter_06

import javax.swing.plaf.ColorChooserUI

fun main() {
    OCustomer.greeting() // 객체의 접근 시점
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}
/*
    결과 :
    Init
    Hello World!
    name = Dooly
    Basketball
    Hello World!
    name = Joosol, HELLO = hello

 */


// 1. object 키워드를 사용한 방식
object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init!")
    }
}

// 2. 컴패니언 객체를 사용한 방식
class CCustomer {
    companion object {
        const val HELLO = "hello" // 상수 표현
        var name = "Joosol"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun greeting() = println("Hello World!")
    }
}

class Hobby(val name: String)