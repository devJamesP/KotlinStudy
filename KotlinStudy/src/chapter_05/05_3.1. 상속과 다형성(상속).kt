package chapter_05

fun main() {
    // 덧셈 동작의 오버로딩
    getBirdsDerivationClass()
}

fun getBirdsDerivationClass() {
    val coco = BirdBase("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown")
    val parrot = OverrideParrot("myparror", 2, "short", "multiple", "korean")

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    lark.singHitone()
    parrot.speak()
    lark.fly()
}

// 1. 상속 가능한 기반 클래스 선언
open class BirdBase(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

// 2. 주 생성자를 사용한 상속
class Lark(
    name: String,
    wing: Int,
    beak: String,
    color: String
    ) : BirdBase(name, wing, beak, color)
{
    // 새로 추가된 메서드
    fun singHitone() = println("Happy Song!")
}

// 3. 부 생성자를 사용하는 상속
class Parrot : BirdBase {
    val language: String
    constructor(
        name: String,
        wing: Int,
        beak: String,
        color: String,
        language: String) : super(name, wing, beak, color) {
            this.language = language
        }

    fun speak() = println("Speak! $language")
}
/*
    결과 :
    Coco: mybird, 2, short, blue
    Lark: mylark, 2, long, brown
    Parrot: myparror, 2, short, multiple, korean
    Happy Song!
    Speak! korean
    Fly wing: 2
 */