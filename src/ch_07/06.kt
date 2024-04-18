package ch_07

fun main() {
    /*
    1. 클래스 상속
    상속 대상이 되는 부모 클래스는 open 키워드로 만들어야만 자식 클래스에서 사용할 수 있음.
    만약 open 키워드로 열려 있지 않으면 상속할 수 없음
    상속을 받을 자식 클래스에서는 콜론을 이용해서 상속할 부모 클래스를 지정

    그리고 상속은 부모 클래스를 자식이 갖는 과정이기 때문에 부모 클래스명 다음에 괄호를 입력해서 꼭 부모의 생성자를 호출해야 함.
    open class 상속 부모 클래스 {
        // 코드
    }
    class 자식 클래스 : 부모 클래스() {
        // 코드
    }

    부모클래스에 세컨더리 생성자가 있다면, 역시 자식 클래스의 세컨더리 생성자에서 super 키워드로 부모 클래스에 전달할 수 있음
    부모 클래스의 세컨더리 생성자를 이용하는 경우에는 부모 클래스명 다음에 오는 괄호를 생략
     */
    open class Parent {
        var hello: String = "안녕하세요"
        fun sayHello() {
            println(hello)
        }
    }

    class Child: Parent() {
        fun myHello() {
            hello = "Hello"
            sayHello()
        }
    }
    val child = Child()
    child.myHello()

    val parent = Parent()
    parent.sayHello()
    /*
    프로퍼티와 메서드의 재정의 : 오버라이드
    1. 메서드 오버리아드
    상속할 메서드 앞에 open 키워드를 붙이면 오버라이드 할 수 있음
     */
    open class BaseClass {
        open fun opend() {

        }
        fun notOpened() {

        }
    }

    class ChildClass : BaseClass() {
        override fun opend() {
            super.opend()
        }
    }
    /*
    2. 프로퍼티 오버라이드
    메서드 오버라이드처럼 프로퍼티 역시 open 으로 열려 있어야만 오버라이드 할 수 있음
     */
    open class BaseClass2 {
        open var opend: String = "I am"
    }
    class ChildClass2: BaseClass2() {
        override var opend: String = "you are"
    }
    /*
    3. 익스텐션
    코틀린은 클래스, 메서드, 프로퍼티에 대해 익스텐션 extensions을 지원.
    이미 만들어져 있는 클래스에 다음과 같은 형태로 추가할 수 있음

    fun 클래스.확장할 메서드() {
        // 코드
    }
    아래 코드는 기본 클래스인 String에 plus 메서드를 확장하는 코드
    test 함수에 선언한 original에 문자열을 입력했기 때문에 original은 String의 익스텐션 메서드인 plus를 호출해서 사용할 수 있다.
     */
    fun String.addText(word: String) : String {
        return this + word
    }

    fun testStrungExtension() {
        val original = "Hello"
        val added = "Guys~"

        println("added를 더한 값은 ${original.addText(added)}입니다.")
    }

    testStrungExtension() // added 를 더한 값은 HelloGuys~ 입니다.
}