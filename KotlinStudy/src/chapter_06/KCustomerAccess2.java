package chapter_06;

public class KCustomerAccess2 {
    public static void main(String[] args) {
        // KJob에 대한 객체 생성 후 접근
        KJob kjob = KCustomer2.JOB;
        System.out.println(kjob.getTitle());

        // KCustomer를 통한 접근
        KCustomer2.JOB.setTitle("Accountant");
        System.out.println(KCustomer2.JOB.getTitle());
    }
}
/*
    결과 :
    Programmer
    Accountant
 */
