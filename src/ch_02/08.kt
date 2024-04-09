package ch_02

fun main() {
    /*
    3. 햠소 파라미터 정의
    코틀린에서 함수 파라미터를 통해 입력되는 모든 값은 변하지 않는 이뮤터블
    코틀린에서 함수 파라미터는 모두 읽기 전용 키워드 val이 생략된 형태라고 생각할 수 있음.

    fun 함수이름 ((val 생략) name1: String, name2: Int, name3: Double) {실행코드}
     */
    // 1) 파라미터의 기본값 정의와 호출
    // 파라미터는 정의할 때 등호(=)를 사용해서 기본값을 설정할 수 있음
    fun newFun(name: String, age: Int = 29, weight: Double = 65.5) {
        println("name의 값은 ${name}입니다.")
        println("age의 값은 ${age}입니다.")
        println("weight의 값은 ${weight}입니다.")
    }
    // 두 번째와 세 번째 파라미터는 설정한 기본값이 자동으로 입력
    newFun("Hello")
    println()
    newFun("Michael", weight = 67.5)
}