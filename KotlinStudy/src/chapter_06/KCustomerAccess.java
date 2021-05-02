package chapter_06;

public class KCustomerAccess {
    public static void main(String[] args) {
        // 코틀린 클래스의 컴패니언 객체에 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login(); // 애노테이션을 사용할 떄 접근 방법
        KCustomer.Companion.login(); // 애노테이션을 사용하지 않을 떄 접근 방법
    }
}
/*
    결과 :
    INTERMEDIATE
    Login...
    Login...
 */
