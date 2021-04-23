package chapter_03

fun networkCall(onSuccess: (Int) -> Unit, onError: (Throwable) -> Unit) {
    val networkResultCode = 1000
    try {
        onSuccess(networkResultCode)
    } catch (e: Exception) {
        onError(e)
    }
}

fun main() {
    // networkCall() 함수 사용 -  람다식을 사용
    networkCall(
        onSuccess =
        { networkResultCode ->
            println(networkResultCode)
        }, onError = { e ->
            println(e)
        })
}

// 결과 : 1000
