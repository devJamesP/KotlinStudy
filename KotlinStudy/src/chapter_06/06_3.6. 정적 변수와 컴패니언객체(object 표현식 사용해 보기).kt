package chapter_06

import java.awt.SystemColor.window
import java.awt.event.MouseAdapter

interface Shape {
    fun onDraw()
}
fun main() {
    val pretendedMan = object: Superman() { // 1. object 표현식으로 fly() 구현의 재정의
        override fun fly() = println("I`m not a real superman. I can`t fly")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}
/*
    결과 :
    Taking photos
    Talking with people
    I`m not a real superman. I can`t fly
 */


open class Superman() {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people")
    open fun fly() = println("Flying in the air.")
}