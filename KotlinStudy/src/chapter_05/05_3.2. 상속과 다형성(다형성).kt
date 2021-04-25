package chapter_05

fun main() {
//    // 덧셈 동작의 오버로딩
//    exAddPolymorphism()

    overridePolymorphism()
}

fun exAddPolymorphism() {
    val calc = Calc()
    println(calc.add(3, 2))
    println(calc.add(3.2, 1.3))
    println(calc.add(3, 3, 2))
    println(calc.add("Hello", "World"))
}

class Calc {
    // 다양한 매개변수로 오버로딩된 메서드
    fun add(x: Int, y: Int): Int = x + y
    fun add(x: Double, y: Double): Double = x + y
    fun add(x: Int, y: Int, z: Int): Int = x + y
    fun add(x: String, y: String): String = x + y
}
/*
    결과 :
    5
    4.5
    6
    HelloWorld
*/

fun overridePolymorphism() {
    val overrideParrot = OverrideParrot(name = "myparrot", beak = "short", color = "multiple")
    overrideParrot.language = "English"

    println("Parrot: ${overrideParrot.name}, ${overrideParrot.wing}, ${overrideParrot.beak}, ${overrideParrot.color}, " +
            "${overrideParrot.language}")
    overrideParrot.sing(5)
}

open class OverrideBaseBird(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

class OverrideParrot(
    name: String,
    wing: Int = 2,
    beak: String,
    color: String,
    var language: String = "natural"
) : OverrideBaseBird(name, wing, beak, color) {
    fun speak() = println("Speak! $language")
    override fun sing(vol: Int) { // 오버라이딩 된 메서드
        println("I`m a parrot! The volume level is $vol")
        speak()
    }
}
/*
    결과 :
    Parrot: myparrot, 2, short, multiple, English
    I`m a parrot! The volume level is 5
    Speak! English
*/

