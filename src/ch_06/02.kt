package ch_06

fun main() {
    /*
    2. 셋 Set
    셋은 중복을 허용하지 않는 리스트
    리스트와 유사한 구조이지만 인덱스로 조회할 수 없고, get() 메서드도 지원하지 않음

    중복되지 않은 요소들로 만들어지므로 같은 값을 추가하더라도 해당 값은 하나만 저장.
    리스트와 마찬가지로 읽기 전용 셋과 읽기 쓰기 모두 가능한 셋, 총 두가지를 제공
    각각 setOf(), mutableSetOf() 함수로 객체를 생성.
     */
    // 읽기 전용 셋
    val immutableSet = setOf(1, 1, 2, 2, 2, 3, 3)
    println(immutableSet)

    // 1) 빈 셋으로 초기화하고 값 입력하기
    var set = mutableSetOf<String>()
    set.add("JAN")
    set.add("FEB")
    set.add("MAR")
    set.add("JAN") // 셋은 중복을 허용하지 ㅇ낳기 때문에 동일한 값은 입력되지 않음

    // 2) 사용하기
    println("Set 전체 출력 : ${set}")  // Set 전체 출력 : [JAN, FEB, MAR]

    // 3) 삭제하기
    set.remove("FEB")
    println("Set 전체 출력 : ${set}")  // Set 전체 출력 : [JAN, MAR]

    // 읽기 쓰기 모두 가능한 셋
    val mutableSet = mutableSetOf(1, 1, 2, 2, 2, 3, 3)
    mutableSet.add(100)
    mutableSet.add(3)
    println(mutableSet) // [1, 2, 3, 100]

    mutableSet.remove(1)
    mutableSet.remove(200)
    println(mutableSet)  // [2, 3, 100]
    println(mutableSet.contains(1))  // false


}