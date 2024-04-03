package test

fun main() {
    /*
    1. 변수
    코틀린에서 값을 변경할 수 있는 변수 variable는 var로, 값을 변경할 수 없는 변수값 value을 val로 선언
     */
    val pi: Double = 3.14 // val 변수명: 자료형 = 값

    // 자료형을 앞에 쓰던 자바와는 다르게 코틀린은 변수명을 먼저 쓰고, 콜론: 을 쓴 후 자료형을 명시.
    // 문맥상 추론이 가능하다면 자료형을 생략할 수 있음. 이를 코틀린의 형추론이라고 함

    val name = "tom" // String 으로 형 추론

    // val 은 값을 변경할 수 없는 변수이므로 값을 재할당을 하면 다음과 같이 컴파일 오류가 남.
//    pi = 3.141592  // 오류 Val cannot be reassigned

    var age = 21  // 형추론 Int
    println(age)  // 21
    age = 25  // 재할당
    println(age)  // 25
}