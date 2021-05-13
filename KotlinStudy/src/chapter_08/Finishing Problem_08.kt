package chapter_08

/*
Q1. T와 같은 표기를 이용해 클래스에서 사용할 자료형을
미리 결정하지 않고 나중에 인스턴스를 생성하며 결정하는 방식을 무엇이라고 하나요?
 */
// 답 : 제네릭


/*
Q2. 제네릭 클래스 Box가 다음과 같이 선언되어 있습니다.
이 클래스를 이용하여 문자열을 받는 변수를 선언하는 방법 중 틀린 것을 고르세요.
class Box<T>(t: T) {
    var name = t
}

1. val str:Box<String> = Box<String>("Hello")
2. val str = Box("Hello")
3. val str = Box<String>("Hello")
4. val str: String = Box("Hello")
 */

// 답 : 4번

/*
Q3. 일반적인 제네릭 함수에서 형식 매개변수 T를 실행 시간에 접근하고자 합니다.
밑줄의 빠진 부분을 채우세요
inline fun < ______ T> myGenericFun()
 */

// 답 : reified