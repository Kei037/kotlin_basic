package ch_07

/*
6. 접근 제한자
코틀린에서 정의되는 클래스, 인터페이스, 메서드, 프로퍼티는 모두 접근 제한자 Visibility Modifiers를 가질 수 있음.
함수형 언어라는 특성 때문에 코틀린은 기본 객체지향에서 접근 제한자의 기준으로 삼았던 패키지 대신에 모듈 개념이 도입.
internal 접근 제한자로 모듈 간에 접근을 제한할 수 있음.

1) 접근 제한자의 종류
접근 제한자는 서로 다른 파일에게 자신에 대한 접근 권한을 제공하는 것인데 각 변수나 클래스 이름 앞에 아무런 예약어를 붙이지
않았을 때는 기본적으로 public 접근 제한자가 적용

private : 다른 파일에서 접근할 수 없음.
internal : 같은 모듈에 있는 파일만 접근할 수 있음.
protected : private와 같으나 상속 관계에서 자식 클래스가 접근할 수 있음.
public : 제한 없이 모든 파일에서 접근할 수 있음.

* 코틀린에서 모듈이란?
코틀린에서 모듈이란 한 번에 같이 컴파일되는 모든 파일을 말함.
안드로이드를 예로 든다면 하나의 앱이 하나의 모듈이 될 수 있음. 또한 라이브러리도 하나의 모듈.

 2) 접근 제한자의 적용
 접근 제한자를 붙이면 해당 클래스, 멤버 프로퍼티 또는 메서드에 대한 사용이 제한.

 접근 제한자가 어떻게 작용하는지 알아봄.
 다양한 접근 제한자를 가지는 부모 클래스를 하나 생성.
 */
open class Parent {
    private val privateVal = 1
    protected open val protectedVal = 2
    internal val internalVal = 3
    val defaultVal = 4
}
// 상속 관계의 경우
class child : Parent() {
    fun callVariables() {
//        println(pivateVal) // 호출이 안됨
        println(protectedVal) // 상속 관계이므로 접근할 수 있음
        println(internalVal)  // 동일한 모듈이므로 접근할 수 있음.
        println(defaultVal)
    }
}
// 상속관계가 아닌 외부 클래스에서 Parent 클래스를 생성하고 사용
// 상속관계가 아니기 때문에 public과 internal 에만 접근할 수 있음
class Stranger {
    fun callVariables() {
        val parent = Parent()
//        println(parent.pivateVal) // 호출이 안됨
//        println(parent.protectedVal) // 호출이 안됨
        println(parent.internalVal)  // 동일한 모듈이므로 접근할 수 있음.
        println(parent.defaultVal)
    }
}