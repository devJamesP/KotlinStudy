package chapter_06

class KCustomer2 {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic fun login() = println("Login...") // 애노테이션 표기 사용
        @JvmField val JOB = KJob() // 특정 자료형을 사용하기 위한 에노테이션
    }
}

class KJob {
    var title: String = "Programmer"
}

/*
KJob에 대한 접근
public class KCustomerAccess {
    public static void main(String[] args) {
    ...

    // KJob에 대한 객체 생성 후 접근
    KJob kjob = new KCustomer.JOB;
    System.out.println(kjob.getTitle());

    // KCustomer를 통한 접근
    KCustomer.JOB.setTitle("Accountant");
    System.out.println(KCustomer.JOB.getTitle());
 */