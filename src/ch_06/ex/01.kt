package ch_06.ex

fun main() {
    /* 문자열을 저장할 수 있는 List 객체를 생성하고 여기에 "a", "b", "c", "d", "e" 를 저장한 후
    이럿을 출력하는 프로그램을 작성
    출력 예:
    [a, b, c, d, e]
    1. 뮤터블  2. 이뮤터블 두 케이스 다 작성
     */
//    val mutableList = mutableListOf<String>()
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("a")
    mutableList.add("b")
    mutableList.add("c")
    mutableList.add("d")
    mutableList.add("e")
    println(mutableList)

    val immutableList = listOf("a", "b", "c", "d", "e")
    println(immutableList)
}