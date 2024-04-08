package ch_02
/*
    while문과 Range.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
    눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해 보세요.
    눈의 합이 5가 되는 조합은 (1, 4), (4, 1), (2, 3), (3, 2)입니다.
     예 ) (5, 1)
    (4, 4)
    (6, 5)
    (5, 2)
    (3, 6)
    (1, 2)
    (2, 3)
     */
fun main() {
//    while (true) {
//        val num1 = (1..6).random()
//        val num2 = (1..6).random()
//        println("($num1, $num2)")
//        if (num1 + num2 == 5) {
//            break
//        }
//    }

    do {
        val num1 = (1..6).random()
        val num2 = (1..6).random()
        println("($num1, $num2)")
    } while (num1 + num2 != 5)
}