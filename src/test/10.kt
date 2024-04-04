package test

fun main() {
    /*
    6. 묵시적 변환
    Any 형은 자료형이 특별히 정해지지 않은 경우에 사용
    코틀린의 Any 형은 모든 클래스의 뿌리. Int나 String 그리고 사용자가 직접 만든 클래스까지
    모두 Any형의 자식 클래스
    즉 코틀린의 모든 클래스는 바로 이 Any형이라는 슈퍼클래스 (SuperClass)를 가짐.

    Any 는 자바의 최상위 클래스인 Object와 비슷하지만 서로 다른 유형

    Any 형은 무엇이든 될 수 있기 때문에 언제든 필요한 자료형으로 자동 형변환 할 수 있음.
    이것을 묵시적 변환 이라고 함
     */

    var a: Any = 1  // 1로 초기화될 때 Int형이 됨
    a = "one"  // 변경된 값에 의 의해 String이 됨

    println("a: $a type: ${a.javaClass}") // a: one type: class java.lang.String

    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any) {
    if (x is String) {
        println("x is String: $x")
    }
    if (x is Int) {
        println("x is Int: $x")
    }
}