package chapter_08.chapter_08_2

data class Product2(val name: String, val price: Double)

fun main() {
    val products2 = arrayOf(
        Product2("Snow Ball", 870.00),
        Product2("Smart Phone", 999.00),
        Product2("Drone", 240.00),
        Product2("Mouse", 333.55),
        Product2("Keyboard", 125.99),
        Product2("Monitor", 1500.99),
        Product2("Tablet", 512.99))

    products2.sortWith ( // Comparator를 이용해 두 객체를 비교하여 p1이 크면 1, 같으면 0, 작으면 -1
        Comparator<Product2> { p1, p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )
    products2.sortWith(compareBy({it.name}, {it.price}))
    products2.forEach { println(it) }

    // 여기 결과가 좀 이상함 확인 필요
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

/*
    products2.sortWith(compareBy({it.name}, {it.price}))추가시
    결과 :
    Product2(name=Drone, price=240.0)
    Product2(name=Keyboard, price=125.99)
    Product2(name=Monitor, price=1500.99)
    Product2(name=Mouse, price=333.55)
    Product2(name=Smart Phone, price=999.0)
    Product2(name=Snow Ball, price=870.0)
    Product2(name=Tablet, price=512.99)
 */