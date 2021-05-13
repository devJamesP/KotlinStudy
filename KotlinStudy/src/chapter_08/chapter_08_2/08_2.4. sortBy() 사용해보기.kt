package chapter_08.chapter_08_2

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
        Product("Tablet", 512.99))

    products.sortBy { it.price } // 값에 따라 정렬
    products.forEach { println(it) }
}
/*
    결과 :
    Product(name=Keyboard, price=125.99)
    Product(name=Drone, price=240.0)
    Product(name=Mouse, price=333.55)
    Product(name=Tablet, price=512.99)
    Product(name=Snow Ball, price=870.0)
    Product(name=Smart Phone, price=999.0)
    Product(name=Monitor, price=1500.99)
 */