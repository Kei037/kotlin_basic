package ch_02

fun main() {
    /*
    do while 문
    do 와 함께 사용하면 조건식에 관계없이 do 블룩 안의 코드를 한 번 실행
     */
    var game = 1
    var match = 6
    do {
        println("${game}이 이겼습니다. 우승까지 ${match - game}게임 남았습니다")
        game++;
    } while (game < match)

    /*
    반복문 break
     */
    for (index in 1..10) {
        println("현재 index는 ${index}입니다.")
        if (index > 5) {
            break
        }
    }
    /*
    continue : 다음 반복문으로
    1) 다음코드는 실행하지 않고 2) 반복문의 코드의 처음으로 돌아감
     */
    for (except in 1.. 10) {
        if (except > 3 && except < 8) {
            continue
        }
        println("현재 index는 ${except}입니다.")
    }
}