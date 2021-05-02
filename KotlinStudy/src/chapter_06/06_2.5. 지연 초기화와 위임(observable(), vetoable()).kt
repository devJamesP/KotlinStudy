package chapter_06

import kotlin.properties.Delegates

fun main() {
    // observable() example
    val user = ObservableUser()
    user.name = "Kildong" // 4. 값이 변경되는 시점에서 첫 이벤트 발생
    user.name = "Dooly"   // 5. 값이 변경되는 시점에서 두 번쨰 이벤트 발생

    // vetoable() example
    var max: Int by Delegates.vetoable(0) { // 1. 초깃값은 0
    prop, old, new ->
        new > old // 2. 조건에 맞지 않으면 거부권 행사
    }

    println(max) // 0
    max = 10
    println(max) // 10

    // 여기서는 기존값이 새 값보다 크므로 false, 따라서 5를 재할당하지 않음
    max = 5
    println(max) // 10
}
/*
    결과 :
    NONAME -> Kildong
    Kildong -> Dooly
    0
    10
    10
 */

class ObservableUser{
    var name: String by Delegates.observable("NONAME") { // 1. 프로퍼티 위임
        prop, old, new -> // 2. 람다식 매개변수로 프로퍼티, 기존 값, 새로운 값 지정
        println("$old -> $new") // 3. 이 부분은 이벤트가 발생할 때만 실행
    }
}
