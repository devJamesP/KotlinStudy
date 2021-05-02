package chapter_06

fun main() {
    val user3 = User3(1, "kildong", 35)
    user3.name = "coco"
    println("user3.name = ${user3.name}")
}
/*
    결과 :
    The name was changed
    user3.name = COCO
 */

class User3(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }

    var age: Int = _age
        private set
    // private set(가시성 지시자 넣어 주면 외부에서 프로퍼티에 값 할당 x)
}