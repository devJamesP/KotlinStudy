package chapter_03

fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
/*
   결과 :
   Hello World!
*/

    // 중위 함수
    val multi = 3 multiply 10
    println("multi = $multi")

/*
결과 :
multi: 30
*/
}

// String 클래스를 확장해 getLongString() 함수 추가
fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target


// Int를 확장해서 multiply() 함수를 하나 더 추가함.
infix fun Int.multiply(x: Int): Int { // infix로 선언되므로 중위 함수
    return this * x
}


