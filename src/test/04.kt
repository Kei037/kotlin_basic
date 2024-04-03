package test

fun main() {
    /*
    기본 자료형
    기본 자료형 primitive data type과 참조 자료형 reference data type 으로 나누어 짐.
    코틀린의 자료형은 모두 참조형. 즉 모든 자료형이 객체 형태

    1) 정수 자료형
    Byte, Short, Int, Long
    코틀린은 형추론을 통해서 자료형을 명시하지 않아도 알아서 추론.
    정수의 경우 숫자가 적어도 Int 형으로 추론하기 때문에 Byte나 Short 같은 작은 범위를 사용할 때는 자료형을 지정해야 함.
     */
    val num1 = 10

    /*
    2. Int : 정수
    가독성을 높이기 위해 언더바(_)로 자릿수를 구분할 수 있음.
    다만, 언더바는 개발자가 읽기 쉽게 하기 위한 것으로 컴퓨터는 동일하게 인식.
     */
    var intValue: Int
    intValue = 3
    intValue = 2_147_483_435  // 2147483435
    println(intValue)

    /*
    2) Long : 정수
    Int 보다 큰 범위의 정수를 저장할 수 있음.
    Double 과 Float 의 관계처럼 Int와 구분하기 위해서 숫자의 끝에 L을 붙여줌.
    Long 타입의 경우에는 설정한 글꼴에 따라 숫자 1과 구분이 어려울 수 있기 때문에 대문자를 사용.
     */
    var longValue: Long
    longValue = 3_141592L  // 3141592
    println(longValue)

    // 3) Short, Byte
    var shortValue: Short = 32_767
    var byteValue: Byte = 127

    // 실수 자료형 : Double, Float  실수의 경우 자료형을 명시하지 않으면 Double, Float으로 지정할려면 값 뒤에 F
    val numFloat = 100.0F  // 자료형 생략 가능
    val numDoulbe: Double = 100.0 // 자료형 생략 가능

    // 실수 Double
    var doubleValue: Double
    doubleValue = 3.141592

    // 실수 Flout
    var floatValue: Float
    floatValue = 3.141582F

    // 3. 문자 자료형
    // Char, String으로 나눌 수 있음
    val char: Char = 'a'        // 자료형 생략 가눙
    val string: String = "abc"  // 자료형 생략 가눙

    // 4. 논리 자료형
    val isTrue: Boolean = true  // 자료형 생략 가눙


}