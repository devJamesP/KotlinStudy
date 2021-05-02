package chapter_06

fun main() {
    println(Person3.language) // 인스턴스를 생성하지 않고 기본값 사용
    Person3.language = "English" // 기본값 변경 가능
    println(Person3.language) // 변경된 나용 출력
    Person3.work() // 메서드 실행
    // println(Person3.name) // name은 컴패니언 객체가 아니므로 오류
}
/*
    결과 :
    Korean
    English
    working...
 */


class Person3 {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

