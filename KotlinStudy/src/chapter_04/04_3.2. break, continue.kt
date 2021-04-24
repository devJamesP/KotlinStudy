package chapter_04

fun main() {
    for(i in 1..5) {
        if (i == 3) break
        print(i)
    }
    println()
    println("outside")

    for(i in 1..5) {
        if (i == 3) continue
        print(i)
    }
    println()
    println("outside")

    println("-------------------")
    labelBreak()
    println("-------------------")
    labelBreak2()

    println("-------------------")
    labelContinue()
}

fun labelBreak() {
    println("labelBreak")
    for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            println("i:$i, j:$j")
        } // break실행 시 second@ 라벨이 있는 블록을 break
        println("after for j")
    }
    println("after for i")
}

fun labelBreak2() {
    println("labelBreak")
    first@ for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i:$i, j:$j")
        }
        println("after for j")
    } // break실행 시 first@ 라벨이 있는 블록을 break
    println("after for i")
}

fun labelContinue() {
    println("labelContinue")
    first@ for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) continue@first
            println("i:$i, j:$j")
        }
        println("after for j")
    } // continue실행 시 first@ 라벨이 있는 블록을 continue
    println("after for i")
}