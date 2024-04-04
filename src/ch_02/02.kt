package ch_02

fun main() {
    print("성적을 입력하세요 : ")
    val grade = readln().toInt()

    val score = if (grade >= 90) {
        "A"
    } else if (grade >= 80) {
        "B"
    } else if (grade >= 70) {
        "C"
    } else if (grade >= 60) {
        "D"
    } else {
        "F"
    }
    println("학점 $score")

//    if (grade >= 90) {
//        println("학점 A")
//    } else if (grade >= 80) {
//        println("학점 B")
//    } else if (grade >= 70) {
//        println("학점 C")
//    } else if (grade >= 60) {
//        println("학점 D")
//    } else {
//        println("학점 F")
//    }
}