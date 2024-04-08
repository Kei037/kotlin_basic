package ch_02
/*
	음수가 입력될 때까지, 사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램을 작성하세요.
	while문을 사용, break 사용하지 말 것
	1) while문으로 작업
	2) do while문으로 작업
 */
fun main() {
    var sum = 0;
    var num = 0;
//    while (num >= 0) {
//        sum += num
//        print("숫자를 입력하세요 >> ")
//        num = readln().trim().toInt()
//    }

    do {
        sum += num
        print("숫자를 입력하세요 >> ")
        num = readln().trim().toInt()
    } while (num >= 0)

    println("입력한 숫자의 합계는 $sum")
}