package chapter_09.chapter_09_5

fun main() {
    val primes = generateSequence(
        2 to generateSequence(3) { it + 2 }) {
        val currSeq = it.second.iterator()
        val nextPrime = currSeq.next()
        nextPrime to currSeq.asSequence().filter {  it % nextPrime != 0 }
    }.map { it.first }
    println(primes.take(10).toList())
}
/*
    결과 :
    [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
 */