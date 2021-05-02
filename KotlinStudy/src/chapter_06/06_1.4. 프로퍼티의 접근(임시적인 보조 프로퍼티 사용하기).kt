package chapter_06

import java.lang.AssertionError

fun main() {
    val user4 = User4(1, "kildong", 35)
    user4.name = ""
    println("user4.name = ${user4.name}")
}

/*
    결과 :
    user4.name = NONAME
 */

class User4(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
    get() {
        if (tempName == null) tempName = "NONAME"
        return tempName ?: throw AssertionError("Asserted by others")
    }

    var age: Int = _age
}