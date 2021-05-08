package chapter_07.chapter_07_1

open class Animal5(var name: String)

interface Pet5 {
    val category: String
    get() = "test"
    val msgTags: String
        get() = "I`m your lovely pet!"

    var species: String // 종을 위한 프로퍼티
    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}

class Dog5(name: String, override var category: String): Pet5, Animal5(name) {
    override var species: String = "dog"
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Cat5(name: String, override var category: String): Pet5, Animal5(name) {
    override var species: String = "cat"
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master5 {
    fun playWithPet(pet: Pet5){ // 인터페이스를 객체로 매개변수를 지정
        println("Enjoy with my ${pet.species}")
    }
}

fun main() {
    val master = Master5()
    val dog = Dog5("Toto", "Small")
    val cat = Cat5("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}

/*
    결과 :
    Enjoy with my dog
    Enjoy with my cat
 */