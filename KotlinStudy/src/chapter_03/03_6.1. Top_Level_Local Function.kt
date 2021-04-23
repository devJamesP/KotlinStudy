package chapter_03

// a()함수에 b() 함수의 내용을 선언
fun a() = b()           // 최상위 함수이므로 b() 함수 선언 위치에 상관없이 사용 가능
fun b() = println("b")  // b() 함수의 선언

fun c() {
    // fun d() = e() // 오류 :: d()는 지역함수이며 e()의 이름을 모름
    fun e() = println("e")
}

var global = 10 // 패키지 Section6의 모든 범위에 적용되는 전역 변수

fun main() {

    // ***최상위 함수와 지역 함수***
    a() // 최상위 함수는 어디서는 호출될 수 있음.
    // e() 오류 :: c() 함수에 정의된 e()는 c의 블록({})을 벗어난 곳에서 사용할 수 없음.

/*
    결과 : b
*/


    // ***지역 변수와 전역 변수의 범위***
    val local1 = 20 // main() 함수 블록 안에서만 유지되는 지역 변수
    val local2 = 21

    fun nestedFunc() {
        global += 1
        val local1 = 30 // func() 함수 블록 안에서만 유지(기존 local1이 가려짐)

        println("nestedFunc local1: $local1")
        println("nestedFunc local1: $local2") // 이 블록 바로 바깥의 main()의 local2 사용
        println("nestedFunc local1: $global")
    }

    nestedFunc()
    outsideFunc()

    println("main global: $global")
    println("main global: $local1")
    println("main global: $local2")

/*
    결과 :
    nestedFunc local1: 30
    nestedFunc local1: 21
    nestedFunc local1: 11
    outsideFunc global: 12
    outsideFunc outVal: outside
    main global: 12
    main global: 20
    main global: 21
*/
}

fun outsideFunc() {
    global += 1
    val outVal = "outside"
    println("outsideFunc global: $global")
    println("outsideFunc outVal: $outVal")
}


