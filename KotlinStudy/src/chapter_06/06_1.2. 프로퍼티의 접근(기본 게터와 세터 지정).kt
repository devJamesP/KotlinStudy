package chapter_06

fun main() {
    val user2 = User2(1, "Kildong", 30)
    user2.age = 35
    println("user1.age = ${user2.age}")
}
/*
    결과 :
    user1.age = 25
 */


class User2(_id: Int, _name: String, _age: Int) {
    // 프로퍼티
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}