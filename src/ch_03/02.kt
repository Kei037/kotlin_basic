package ch_03

fun main() {
    /*
    1. for 반복문
    for 다음의 괄호 (()) 안에 반복할 범위를 지정하면 for 블록의 코드가 지정한 횟수만큼 반복해서 동작.
    for (반복할 범위) {
        실행 코드
    }

    1) for in .. (온점 2개): 일반벅인 형태의 for 반복문
    시작값과 종료값으로 지정한 숫자 범위만큼 코드를 반복하는 일반적인 방법.
    in을 사용해서 반복하는 범위의 숫자를 변수에 담아두고 사용.
    for (변수 in 시작값..종료값) {
        실행 코드
    }

    1부터 10까지 열 번 반복하면서 그 숫자를 변수 index에 가장 먼저 저장하고, for 블록의 코드를 실행.
    첫 번째 반복에서는 변수 index에 '1'이 저장되고, 두 번째 반복에서는 index에 '2'가 저장
     */
    for (index in 1..10) {
        println("현재 숫자는 ${index}")
    }
    println()
    /*
    2) until : 마지막 숫자 제외하기
    시작값과 종료값 사이의 .. 대신에 until을 사용하면 종료값 이전까지만 반복.
    for (변수 in 시작값 until 종료값) {
        실행 코드
    }

    배열의 index가 항상 0부터 시작하기 때문에 배열의 인덱스르 사용하여 처리하는 코드에서 사용.
    배열의 인덱스가 0부터 시작하기 때문에 배열의 크기는 항상 '마지막 인덱스 + 1의 값',
    따라서 반복을 할 때 배열의 크기 바로 전까지만 반복.
     */

    val array: Array<String> = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
    for (index in 0 until array.size) {
        println("현재 월은 ${array[index]}입니다.")
    }
    println()

    /*
    3) step : 건너뛰기
    예를 들어 1부터 100까지 반복하면서 3의 배수만 사용하고 싶을때 사용.
    이럴 때 step을 사용하면 for 문의 블록을 step 수 만큼 건너뛰어서 실행
    for (변수 in 시작값..종료값 step 3) {
        실행 코드
    }
     */

    for (index in 0..100 step 3) {
        println("현재 숫자는 ${index}")
    }

    /*
    4) downTo : 감소시키기
    .. 대신 downTo 를 사용하면 큰 수에서 작은 수로 감소시키면서 실행할 수 있음.
     */
    for (index in 10 downTo 0) {
        println("현재 숫자는 ${index}")
    }

    // 증가할 때와 같이 step 을 사용할 수도 있음.
    for (index in 10 downTo 0 step 3) {
        println("건너뛰면서 감소시키기: ${index}")
    }

    /*
    5) 배열, 컬렉션에 들어 있는 엘리먼트 반복하기
    배열이나 컬렉션을 엘리먼트의 개수만큼 반복하면서 사용.
    인덱스를 사용한는 방법보다 더 편하고 가독성이 좋음.
     */
    val arrayMonth = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
    for (month in arrayMonth) {
        println("현재 월은 ${month}입니다.")
    }

    // withIndex() 함수를 이용하면 요소의 인덱스도 함께 가져올 수 있음.
    val students = arrayOf("John", "Peter", "Jane")
    for ((index, name) in students.withIndex()) {
        println("Index: $index, Name $name")
        // Index: 0, Name John
        // Index: 1, Name Peter
        // Index: 2, Name Jane
    }

}