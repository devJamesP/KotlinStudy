package chapter_07.chapter_07_1

open class Animal4(val name: String)

interface Pet4 {
    var category: String
    val msgTags: String
    get() = "I`m your lovely pet!"

    val species: String // 종을 위한 프로퍼티
    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}

class Cat4(name: String, override var category: String): Pet4, Animal4(name) {
    override var species: String = "cat"

    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}