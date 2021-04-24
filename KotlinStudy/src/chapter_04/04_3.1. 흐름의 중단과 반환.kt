package chapter_04

fun main() {
    // inline을 사용한 람다식의 반환
    retFunc()

    // 라벨을 사용한 람다식의 반환
    retFuncLabel()

    // 암묵적 라벨
    retFuncImplicitLabel()

    // 익명함수를 사용한 반환
    retFuncAnonymous()

    // 라벨을 붙인 람다식과 익명함수의 반환
    returnLambdaLabel()
    returnAnonymousFunc()
}


inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) {a, b ->
        val result = a + b
        // return문이 호출되면 람다식 바깥의 함수를 빠져나가서 end of retFunc()도 호출되지 않습니다.
        if(result > 10) return
        println("result: $result")
    }
    println("end of retFunc")
}
/*
    결과 :
    start of retFunc
*/


fun labelLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

// inline을 지우면 람다 내부의 return부분에 오류가 표시됨 -> 라벨을 붙여주면 오류가 사라짐.
fun retFuncLabel() {
    println("start of retFunc")
    labelLambda(13, 3) lit@{a, b -> // 1. 람다식 블록의 시작 부분에 라벨을 지정
        val result = a + b
        if(result > 10) return@lit  // 2. 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    } // 3. 이부분으로 빠져나감
    println("end of retFunc")
}
/*
    결과 :
    start of retFunc
    end of retFunc
*/

// 암묵적 라벨
fun retFuncImplicitLabel() {
    println("start of retFunc")
    labelLambda(13, 3) {a, b ->
        val result = a + b
        if(result > 10) return@labelLambda  // 1. 암묵적 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    } // 2. 이부분으로 빠져나감
    println("end of retFunc")
}

fun retFuncAnonymous() {
    println("start of retFunc")
    labelLambda(13, 3, fun(a, b) {
        val result = a + b
        if(result > 10) return
        println("result: $result")
    })
    println("end of retFunc")
}
/*
    결과 :
    start of retFunc
    end of retFunc
*/

// 람다식을 이용한 반환
fun returnLambdaLabel() {
    val getMessage = lambda@ {num: Int->
        if(num !in 1..100) {
            return@lambda "Error"
        }
        "Success"
    }
    println(getMessage(100))
}
/*
    결과 :
    Success
*/

// 익명 함수를 이용한 반환
fun returnAnonymousFunc() {
    val getMessage = fun(num: Int): String {
        if(num !in 1..100) {
            return "Error"
        }
        return "Success"
    }
    println(getMessage(110))
}
/*
    결과 :
    Success
*/
