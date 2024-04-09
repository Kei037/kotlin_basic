package ch_02

fun main() {
    /* 키보드로 부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
    실행결과를 보고 알맞게 작성해 보세요. */
    var run = true // 반복문의 조건으로 사용 -> 값이 false가 된다면 반복문이 종료
    var studentNum = 0 // 학생수
    var scores: IntArray = IntArray(0) // 점수를 입력 받을 빈 배열 생성. 사용자에게 입력받은 학생수를 기준으로 배열 생성.

    while (run) {
        println("-----------------------------------------------------")
        println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료")
        println("-----------------------------------------------------")
        print("선택> ")
        val selectNo: Int = readln().trim().toInt()
        when (selectNo) {
            1 -> scores = inputStudentNum() // 학생수를 입력 받아서 배열 생성
            2 -> inputScores(scores) // 생성된 배열의 갯수 만큼 점수 입력
            3 -> printScores(scores) // 입력받은 배열의 값을 출력
            4 -> printAnalysis(scores) // 최고 점수, 평균 점수 출력
            5 -> run = setRun() // run 값 변경
        }
    }
    println("프로그램 종료")
}

fun inputStudentNum() : IntArray{
    print("학생수> ")
    val studentNum = readln().toInt()
    return IntArray(studentNum)
}

fun inputScores(scores: IntArray) {
    for (i in scores.indices) {
        print("scores[${i}]> ")
        scores[i] = readln().toInt()
    }
}

fun printScores(scores: IntArray) {
    for (i in scores.indices) {
        println("scores[${i}]> ${scores[i]}")
    }
}

fun printAnalysis(scores: IntArray) {
    var max = scores[0]
    var sum = scores[0]
    for (i in 1 until scores.size) {
        max = if (max < scores[i]) scores[i] else max
        sum += scores[i]
    }
    println("최고 점수: ${max}")
    println("평균 점수: ${sum.toDouble() / scores.size}")
}

fun setRun() : Boolean {
    return false
}