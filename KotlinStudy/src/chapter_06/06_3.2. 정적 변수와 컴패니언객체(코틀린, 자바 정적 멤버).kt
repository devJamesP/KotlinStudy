package chapter_06

/*
// 자바의 Customer 클래스
public class Customer {
    public static final String LEVEL = "BASIC" // static 필드
    public static void login() { // static 메서드 
        System.out.println("Login...");
    }
}
*/
// 코틀린에서 자바 클래스의 static 멤버에 접근
fun main() {
    println(Customer.LEVEL)
    Customer.login()
}



// 컴패니언 객체를 가진 코틀린의 클래스
class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE"

        @JvmStatic // 애노테이션 표기
        fun login() = println("Login...")
    }
}

/*
// 자바에서 코틀린 클래스 접근하기
public class KCustomerAccess {
    public static void main(String[] args) {
        // 코틀린 클래스의 컴패니언 객체에 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login(); // 애노테이션을 사용할 떄 접근 방법
        KCustomer.Companion.login(); // 애노테이션을 사용하지 않을 떄 접근 방법
    }
}
*/
