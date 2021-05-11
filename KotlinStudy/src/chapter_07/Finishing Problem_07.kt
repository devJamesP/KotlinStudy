package chapter_07
//
//
//    01. 위임을 통해 메서드에 접근하는 코드가 있습니다.
//    interface A {
//        fun functionA() { }
//    }
//    interface B {
//        fun functionB() { }
//    }
//    class DelegatedC(a: A, b: B): ________ {
//        fun functionC() {
//            functionA()
//            functionB()
//        }
//    }
//
//    정답 : A by a, B by b
//
//
//    02. 데이터 전달을 위해 사용하는 클래스는 ____ 키워드를 사용하여 정의하면
//    toString()이나 equals()와 같은 메서드가 자동으로 생성됩니다.
//
//    정답 : data
//
////    03. 다음은 내부의 클래스에서 바깥 클래스의 멤버에 접근하는 코드입니다.
//    class Outer(val name: String) {
//        private val origin = "hello"
//        ________class MyClass(val from: String) {
//            fun getInfo() = "${name} says $origin from ${from}"
//        }
//    }
//
//    정답 : Inner





