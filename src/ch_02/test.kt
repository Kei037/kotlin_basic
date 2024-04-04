package ch_02

import java.util.Scanner

fun main() {
    /*
    사용자에게 입력받은 정수가 양수인지, 0인지, 음수인지 알려주는 코드
     */
    print("정수를 입력하세요.")

    val scanner = Scanner(System.`in`)
//    val num = readln().toInt()
    val num = scanner.nextInt()
    if (num > 0) {
        println("양수입니다.")
    } else if (num == 0) {
        println("0 입니다.")
    } else {
        println("음수입니다.")
    }
}