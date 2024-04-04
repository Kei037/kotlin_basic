package ch_02

fun main() {
    /*
    파라미터 없는 when 사용 ( if 문 처럼 )
     */
    val currentTime = 6
    when {
        currentTime == 5 -> {
            println("현재 시간은 5시입니다.")
        }
        currentTime > 5 -> {
            println("현재 시간은 5시가 넘었습니다.")
        }
        else -> {
            println("현재 시간은 5시 이전입니다.")
        }
    }

}