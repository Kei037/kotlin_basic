package ch_06

import kotlin.reflect.typeOf

/*
    컬렉션
    자바에서도 리스트 List, 셋 Set, 맵 Map 등 여러 자료구조를 이용
    코틀린에서도 이러한 컬렉션을 모두 사용할 수 있을 뿐만 아니라 몇 가지 편리한 함수를 추가로 제공.
    또한 코틀린은 컬렉션을 읽기 전용 immutable 컬렉션과 읽기-쓰기 mutable 컬렉션으로 크게 두 가지로 나눔.
 */
fun main() {
    /*
    1. 리스트
    리스트 List는 저장되는 데이터에 1) 인덱스를 부여한 컬렉션이며 2) 중복된 값을 입력할 수 있음.
    코틀린에서 동적으로 리스트를 사용하기 위해서는 리스트 자료형 앞에 뮤터블 Mutable 이라는 접두어 prefix 가 붙음
    접두어가 있는 리스트도 있지만 잘 사용하지 않기 때문에 항상 mutableList, mutableMap, mutableSet을 사용.

    뮤터블
    프로그래밍 언어에서 뮤터블은 변할 수 있는 데이터 타입을 가르키는 용어. 변수로는 var이 뮤터블
    그리고 반대 개념인 이뮤터블 Immutable 이 있는데 이것은 val과 같이 변할 수 없는 데이터 타입을 가르키는 용어

    코틀린은 컬렉션 데이터 타입을 설계할 때 모두 이뮤터블로 설계
    기본 컬렉션인 리스트, 맵, 셋은 모두 한 번 입력된 값을 바꿀 수 없음.
    그래서 컬렉션의 원래 용도인 동적 배열로 사용하기 위해서는 뮤터블로 만들어진 데이터 타입을 사용해야 함.

    먼저 읽기 전용 리스트를 만들 것인지, 읽기 쓰기 모두 가능한 리스트를 만들 것인지를 정한 후,
    목적에 맞는 함수를 사용해 리스트를 만들어야 함.

    읽기 전용 리스트는 listOf() 함수를 사용
     */
    val numList = listOf(1, 2, 3)
    println(numList.javaClass) //class java.util.Arrays$ArrayList
    println(numList[1]) // 2
//    numList[0] = 10  // immutable(읽기 전용) 오류 발생

    // 읽기 쓰기 모두 가능한 리스트를 만들려면 mutableListOf() 함수를 사용하면 됨
    val mutableList = mutableListOf("MON", "TUE", "WED")
    println(mutableList.javaClass) // class java.util.ArrayList

    // 리스트에 값 추가하기 : add
    mutableList.add("THU") // 입력되는 순서대로 인덱스 지정
    println(mutableList) // [MON, TUE, WED, THU]

    // 리스트에 입력된 값 사용하기 : get
    var variable = mutableList.get(1)  // 두 번째 값을 변수에 저장
    variable = mutableList[1]
    println(variable)  // TUE

    // 리스트 값 수정하기 : set
    mutableList.set(1, "수정할 값") // 두번째 값 수정
    mutableList[1] = "수정할 값"
    println(mutableList)  // [MON, 수정할 값, WED, THU]
    println()

    // 리스트에 입력된 값 제거하기 removeAt
    println(mutableList) // [MON, 수정할 값, WED, THU]
    mutableList.removeAt(1) // 두 번째 값 삭제, 다음 인덱스가 하나씩 감소하면서 빈자리의 인덱스로 이동.
    println(mutableList) // [MON, WED, THU]

    /* 빈 리스트 사용하기
    아무것도 없는 빈 리스트를 생성하면 앞으로 입력되는 데이터 타입을 알 수 없기 때문에 값의 타입을 추론할 수 없음
    그래서 '데이터타입of' 만으로는 생성되지 않고 데이터 타입을 직접적으로 알려주는 방법을 사용해야 함
    var 변수명 = mutableListOF<컬렉션에 입력될 값의 타입>()
    var stringList = mutableListOf<Stirng>()  */
    // 생성
    val stringList = mutableListOf<String>()  // 문자열로 된 빈 컬렉션을 생성
    stringList.add("월")
    stringList.add("화")
    println(stringList[1]) // 화

    // 수정
    stringList.set(1, "수정한 값")

    // 삭제
    stringList.removeAt(1) // 두 번째 값 삭제

    // 컬렉션 개수 가져오기 : size
    println("stringList에는 ${stringList.size}개의 값이 있습니다.")
}