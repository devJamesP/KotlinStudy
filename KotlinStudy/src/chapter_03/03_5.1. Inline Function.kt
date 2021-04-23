package chapter_03

fun main() {
    // Basic inline
    shortFunc(3) { println("First call : $it") }
    shortFunc(5) { println("Second call : $it") }

/*
    결과 :
    Before calling out()
    First call : 3
    After calling out()
    Before calling out()
    Second call : 5
    After calling out()
*/

    // noInline (overloading)
    println()
    println("-------------------")
    shortFunc(7.0f) { println("First call : $it") }

/*
    결과 :
    Before calling out()
    First call : 7.0
    After calling out()
*/


    // Using crossInline
    println()
    println("-------------------")
    shortFunc(3.0) {
        println("First call : $it")
        // return 사용 x
    }

/*
    결과 :
    Before calling out()
    First call : 3.0
    After calling out()
*/

    // non-local Return
    println()
    println("-------------------")
    shortFunc(3) {
        println("First call : $it")
        return
    }

/*
    결과 :
    Before calling out()
    First call : 3
*/

}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

inline fun shortFunc(a: Float, noinline out: (Float) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

inline fun shortFunc(a: Double, crossinline out: (Double) -> Unit) {
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}

