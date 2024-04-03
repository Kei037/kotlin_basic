package test

fun main() {
    /*
    val = 최초로 지정한 값으로 초기화하고 더 이상 바꿀 수 없는 '읽기 전용 변수'
    var = 최초로 지정한 변수의 초깃값이 있더라고 '값 변경 가능'

    선언 예시 :
    val username: String = 'Kildong"
     */
    val number = 10
    var language = "Korean"
    language = "English"
//    language = 10  // 파이썬 처럼 다른 데이터 타입의 데이터 저장 불가능
    val secondNumber: Int = 20
//    secondNumber = 30  // val로 선언한 변수를 값을 다시 할당할 수 없음.

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}