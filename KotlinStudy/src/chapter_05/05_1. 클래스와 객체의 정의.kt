package chapter_05

fun main() {
    // Bird 클래스
    getBirdClass()
}


fun getBirdClass() {
    val coco = Bird() // 4. 클래스 생성자를 통한 객체 생성
    coco.color = "blue" // 5. 객체의 프로퍼티에 값 할당

    println("coco.color = ${coco.color}") // 6. 객체의 프로퍼트 값 읽기
    coco.fly() // 7. 객체의 멤버 메서드 사용
    coco.sing(3)
}
// Bird 클래스 만들어 보기
class Bird { // 1. 클래스 정의
    // 2. 프로퍼티 정의
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    // 3. 메서드 정의
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
/*
    결과 :
    coco.color = blue
    Fly wing: 2
    Sing vol: 3
*/


