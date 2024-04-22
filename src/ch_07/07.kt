package ch_07
/*
1. 패키지
디렉토리가 계층 구조로 만들어져 있으면 점(.)으로 구분해서 각 디렉토리를 모두 나열해 줌.
하나의 패키지에 여러 개의 파일을 생성할 수 있기 때문에 '서로 관계가 있는 파일을 동일한 패키지로' 만들어두면 관리가 용이.

2. 추상화
프로그래밍을 하기 전 개념 설계를 하는 단계에서는 클래스이름과 클래스 안에 있음 직한 기능을 유추해서 메서드 이름으로 먼저 나열
이 때 명확한 코드는 설계 단계에서 메서드 블록 안에 직접 코드를 작성하는데, 그렇지 않은 경우에는 구현 단계에서 코드를 작성하도록 나열
이 것을 추상화 Abstract 라고 하면 abstract 키워드를 사용해서 명시.

구현 단계에서는 이 추상화된 클래스를 상속받아서 아직 구현되지 않은 부분을 마저 구현
다음과 같이 추상화된 Animal 클래스를 만들고 동물이 사용할 것 같은 기능중 walk()와 move()를 설계한다고 가정
 */

abstract class Animal {
    fun walk() {
        println("Walking")
    }
    abstract fun move()
}
/*
앞으로 상속받을 자식 클래스의 특징에 따라 코드가 결정될 가능성이 있다면 해당 기능도 abstract 키워드로 추상화
실제 구현클래스에서는 이 추상 클래스를 상속받아서 아직 구현되지 않은 추상화되어 있는 기등을 모두 구현해 줌.
추상클래스는 독립적으로 인스턴스화 할 수 없기 때문에 구현 단계가 고려되지 않는다면 잘못된 설계가 될 수 있음.
 */
class Bird : Animal() {
    override fun move() {
        println("Bird move")
    }
}
/*
3. 인터페이스
안드로이드에서는 주로 상속 관계의 설계보다는 외부 모듈에서 내가 만든 모듈을 사용할 수 있도록 메서드의 이름을 나열해둔 일종의 명세서로 제공
interface 예약어를 사용해서 정의할 수 있고 인터페이스에 정의된 메서드를 오버라이드해서 구현할 수 있음.
코틀린은 프로퍼티도 인터페이스 내부에 정의할 수 있고, 추상클래스와 다르게 class 키워드는 사용되지 않음.
 */
interface InterfaceKotiln {
    var variable : String
    fun get()
    fun set()
}
/*
인터페이스 구현하기 상속과 다르게 생성자를 호출하지 않고 인터페이스 이름만 지정해 주면 됨
 */
class kotlinImpl : InterfaceKotiln {
    override var variable: String = "Default"
    override fun get() {

    }
    override fun set() {

    }
}

/*
인터페이스를 코틀린의 상속 형태가 아닌 소스 코드에서 직접 구현할 때도 있는데, object 키워드를 사용해서 구현해야 함
안드로이드 프로젝트에서 자주 사용하는 형태
 */
val kotlinImpl1 = object : InterfaceKotiln {
    override var variable: String = "Default"
    override fun get() {

    }
    override fun set() {

    }
}
/*
* 인터페이스의 효율적인 사용
인터페이스는 외부의 다른 모듈을 위한 의사소통 방식을 지원하는 것, 혼자 개발하거나 소수의 인원이 하나의 모듈 단위를 개발할 때는
인터페이스를 하용하지 않는 것이 좋음, 인터페이스를 남용하면 코드의 가독성과 구현 효율성이 떨어지기 때문.
 */
