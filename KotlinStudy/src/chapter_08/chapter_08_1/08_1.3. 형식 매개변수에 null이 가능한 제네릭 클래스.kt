package chapter_08.chapter_08_1

class GenericNull<T> { // 기본형으로 null이 허용되는 형식 매개변수
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

class GenericNull2<T: Any> { // 자료형 Any가 지정되어 null이 허용되지 않음.
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>() // non-null로 선언
    obj.EqualityFunc("Hello", "World") // null이 허용되지 않음.

    val obj2 = GenericNull<Int?>() // null이 가능한 형식으로 선언됨.
    obj2.EqualityFunc(null, 10) // null 사용

//    val obj3 = GenericNull2<Int?>() // 오류!! null이 허용되지 않음.

}
/*
    결과 :
    false
    null
 */