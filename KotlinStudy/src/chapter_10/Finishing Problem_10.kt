package chapter_10

/*
Q1. 다음 코드를 코틀린의 표준 람다식 함수인 let을 사용하여 바꿔 보세요.
var property: Int? = 42

fun someMethod() {
    if (property != null) {
        println("someMethod: $property")
    }
}

답 : property?.let { println("someMethod: $it") }

Q2. 객체 person에 대한 멤버에 접근할 때 객체 이름을 생략하여 접근하려면 어떻게 해야 할까요?
val person = Person().________ {
    name = "홍길동"
    age = 30
}

답 : apply

Q3. 넌-널(nun-null)단정 코드를 잘 사용하지 않는 이유는 ________가 발생할 수 있기 때문입니다.

답 : NullPointerException(NPE), 보통은 let()함수나 엘비스 오퍼레이터(연산자)등을 사용합니다.

 */