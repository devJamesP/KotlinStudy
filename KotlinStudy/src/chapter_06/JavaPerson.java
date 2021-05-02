package chapter_06;

public class JavaPerson {
    // 멤버 필드
    private String name;
    private int age;

    // 생성자
    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 게터와 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Main {
    public static void main(String[] args) {
        JavaPerson p1 = new JavaPerson("Kildong", 35);
        // p1.name = "dooly" 1. 접근 불가
        p1.setName("dooly"); // 2. 세터에 의한 접근

        System.out.println(p1.getName()); // 3. 게터에 의한 접근
    }
}
/*
    결과 :
    dooly
 */