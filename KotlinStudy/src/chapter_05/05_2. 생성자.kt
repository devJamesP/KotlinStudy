package chapter_05

fun main() {
    // 부 생성자를 사용한 Bird2클래스
    getBirdClass2()

    // 주 생성자를 사용한 Bird3클래스
    getBirdClass3()

      // 초기화 블록을 가진 주 생성자 Bird4클래스
      getBirdClass4()

}


class Bird2 {
    // 1. 프로퍼티만 선언
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    // 2. 부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        // 3. 객체 생성 시 프로퍼티에 매개변수 값 할당
        this.name = _name
        this.wing = _wing
        this.beak = _beak
        this.color = _color
    }

    // 5. 두번째 부 생성자
    constructor(_name: String, _beak: String) {
        // 3. 객체 생성 시 프로퍼티에 매개변수 값 할당
        this.name = _name
        this.wing = 2
        this.beak = _beak
        this.color = "grey"
    }

    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}


fun getBirdClass2() {
    // 4. 생성자의 인자로 객체 생성과 동시에 초기화
    val coco = Bird2("mybird2", 2, "short", "blue")

    println("coco.color = ${coco.color}")
    coco.fly()
    coco.sing(3)

    println("-------------------------------------")

    // 두번째 부 생성자 호출
    val coco2 = Bird2("mybird2", "long")
    println("coco2.color = ${coco2.color}")
    coco2.fly()
    coco2.sing(3)
}
/*
    결과 :
    coco.color = blue
    Fly wing: 2
    Sing vol: 3
-------------------------------------
    coco2.color = grey
    Fly wing: 2
    Sing vol: 3
*/


class Bird3(var name: String, var wing: Int, var beak: String, var color: String) {
    // 프로퍼티는 매개변수 안에 var를 사용해 프로퍼티로서 선언되어 본문에서 생략됨.

    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun getBirdClass3() {
    // 4. 생성자의 인자로 객체 생성과 동시에 초기화
    val coco = Bird3("mybird3", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color = ${coco.color}")
    coco.fly()
    coco.sing(3)
}
/*
    결과 :
    coco.color = yellow
    Fly wing: 2
    Sing vol: 3
*/


class Bird4(var name: String, var wing: Int, var beak: String, var color: String) {
    // 1. 초기화 블록
    init {
        println("--------초기화 블록 시작--------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("--------초기화 블록 끝--------")
    }
    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun getBirdClass4() {
    // 2. 객체 생성과 함께 초기화 블록 수행
    val coco = Bird4("mybird4", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color = ${coco.color}")
    coco.fly()
}
/*
    결과 :
    --------초기화 블록 시작--------
    이름은 mybird4, 부리는 short
    Sing vol: 3
    --------초기화 블록 끝--------
    coco.color = yellow
    Fly wing: 2
*/

// 프로퍼티의 기본값 지정
class Bird5(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {
    // name과 wing의 값을 입력하지 않으면 default값이 할당됨.
}