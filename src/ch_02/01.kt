package ch_02

fun main() {
    var a = 5
    var b = 3
    var bigger = if (a > b) a else b
    println("bigger: $bigger")  // 5

    // if 문의 코드 영역이 여러줄일 경우도 마지막 줄을 변수값으로 사용 가능
    bigger = if (a > b) {
        var c = 30
        a
    } else {
        b
    }
    println("bigger: $bigger")  // 5

    var era0fRyu = 2.32
    var era0fDegrom = 2.43

    val era = if (era0fRyu < era0fDegrom) {
        println("2019 류현진이 디그롬을 이겼습니다.")
        era0fRyu
    } else {
        println("2019 디그롬이 류현진을 이겼습니다.")
        era0fDegrom
    }
    println("2019 가장 높은 ERA는 ${era}")

    /*
    if문을 활용하여 분수에 값을 할당할 수 있음
    값을 할당해야 하므로 반드시 else 문 필요
     */
    val myAge= 20
    val isAdult = if (myAge > 20) true else false

    println("성인 여부 : $isAdult")
}