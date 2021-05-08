package chapter_07.chapter_07_1

interface Pet2 {
    var category: String
    val msgTags: String // val 선언 시 게터의 구현이 가능
        get() = "I`m your lovely pet!"

    fun feeding()
    fun patting() {
        println("Keep pattin!")
    }
}