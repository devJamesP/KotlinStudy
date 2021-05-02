package chapter_06

import java.lang.reflect.Field


// Q1. name 프로퍼티에 할당하는 세터 작성
class UserFinalProblem06(_name: String, _age: Int) {
    var name: String = _name
    set(value) {
        println("The name was changed")
        field = value.toUpperCase()
    }
    var age: Int = _age
}

// Q2. 지연 초기화를 위한 Person 클래스의 name 선언
class PersonFinalProblem06 {
    lateinit var name: String
}

// Q3. 클래스를 이용하지 않아도 (object)를 사용하면
// 특정 객체를 사용하거나 클래스 선언 없이 객체를 변경하고 생성할 수 있습니다.
