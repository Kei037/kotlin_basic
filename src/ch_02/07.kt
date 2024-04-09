package ch_02

fun main() {
    /*
    함수는 fun으로 정의하고 반환값이 있는 함수는 내부에서 return 으로 값을 반환
    함수를 정의할 때 입력값을 기술한 것을 '파라미터'

    1. 함수의 정의
    fun 함수이름 (파라미터 이름 : 타입) : 반환타입 {
        return 값
    }
     */
    /*
    1) 반환값과 입력값이 있는 함수의 정의
    Int 타입의 x라는 파라미터를 갖는 함수 square() 를 정의.
     */
    fun square(x: Int) : Int {
        return x * x
    }
    println(square(10))

    // 2) 반환값이 없는 함수의 정의
    fun printSum(x: Int, y: Int) {
        println("x + y = ${x + y}")
    }
    printSum(1, 2)

    // 3) 입력값 없이 반환값만 있는 함수의 정의
    fun getPi(): Double {
        return 3.14
    }

    // 2. 함수의 사용(호출)
    var squareResult = square(30)
    println("30의 제곱은 ${squareResult}입니다.")
    println("40의 제곱은 ${square(40)}입니다.")
}