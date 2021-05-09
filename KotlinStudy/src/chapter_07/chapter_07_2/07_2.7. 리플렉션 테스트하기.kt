package chapter_07.chapter_07_2

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

class User(val id: Int, val name: String, var grade: String = "Normal") {
    fun check() {
        if (grade == "Normal")println("You need to get the Silver grade")
    }
}

fun main() {
    // 타입을 출력
    println(User::class) // 클래스 레퍼런스를 위해 ::class 사용
    val classInfo = User::class
    classInfo.memberProperties.forEach {
        println("Property name: ${it.name}, type: ${it.returnType}")
    }
    classInfo.memberFunctions.forEach {
        println("Function name: ${it.name}, type: ${it.returnType}")
    }

    // 함수에 전달해 자료형을 알아냄
    getKotlinType(User::class)
}

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

/*
    결과 :
    class chapter_07.chapter_07_2.User
    Property name: grade, type: kotlin.String
    Property name: id, type: kotlin.Int
    Property name: name, type: kotlin.String
    Function name: check, type: kotlin.Unit
    Function name: equals, type: kotlin.Boolean
    Function name: hashCode, type: kotlin.Int
    Function name: toString, type: kotlin.String
    chapter_07.chapter_07_2.User
 */