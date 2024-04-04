package ch_02

fun main() {
    print("성적을 입력하세요 : ")
    val grade = readln().trim().toInt()

    val score = when (grade) {
        in 90..100 ->  "A"
        in 80..90 ->  "B"
        in 70..80 ->  "C"
        in 60..70 -> "D"
        else -> "F"
    }
    println("입력하신 성적은 ${grade}점이고, 학점은 ${score}입니다")
}