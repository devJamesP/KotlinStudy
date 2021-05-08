package chapter_07.chapter_07_1

open class Animal(val name: String)

interface Pet3 {
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티
    fun feeding() // 추상 메서드
    fun patting() { // 일반 메서드: 구현부를 포함하면 일반적인 메서드로 기본이 됨.
        println("Keep patting!") // 구현부
    }
}

// 1. feeding의 구현을 위해 인터페이스 Pet지정
class Dog3(name: String, override var category: String) : Animal(name), Pet3 {
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Cat3(name: String, override var category: String) : Animal(name), Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master {
    fun playWithPet(dog: Dog3) { // 2. 각 애완동물 종류에 따라 오버로딩됨
        println("Enjoy with my dog.")
    }
    fun playWithPet(cat: Cat3) { // 3. 고양이를 위한 메서드
        println("Enjoy with my cat")
    }
}

fun main() {
    val master = Master()
    val dog = Dog3("Toto", "Small")
    val cat = Cat3("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}