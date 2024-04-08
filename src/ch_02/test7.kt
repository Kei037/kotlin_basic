package ch_02
/* 키보드로 부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
    실행결과를 보고 알맞게 작성해 보세요.

    실행 예)
    -----------------------------------------------------
    1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
    -----------------------------------------------------
    선택> 1
    학생수> 3
    [0, 0, 0]
    -----------------------------------------------------
    1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
    -----------------------------------------------------
    선택> 2
    scores[0]> 90
    scores[1]> 80
    scores[2]> 70
    -----------------------------------------------------
    1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
    -----------------------------------------------------
    선택> 3
    scores[0]: 90
    scores[1]: 80
    scores[2]: 70
    -----------------------------------------------------
    1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
    -----------------------------------------------------
    선택> 4
    최고 점수: 90
    평균 점수: 80.0
    -----------------------------------------------------
    1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
    -----------------------------------------------------
    선택> 5
    프로그램 종료
     */
fun main() {
    var run = true
    var studentNum: Int  = 0 // 학생수
    var scores = IntArray(0) // 점수를 입력받을 빈 배열 생성. 사용자에게 입력받은 학생수를 기준으로 배열 생성.

    while (run) {
        println("-----------------------------------------------------")
        println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료")
        println("-----------------------------------------------------")
        print("선택> ")
        val selectNo = readln().toInt()
        // when 문으로 작업
        when (selectNo) {
            1 -> {
                print("학생수> ")
                studentNum = readln().toInt()
                scores = IntArray(studentNum)
                println(scores.toList())
            }
            2 -> {
                for (i in scores.indices) {
                    print("scores[${i}]> ")
                    scores.set(i, readln().toInt())
                }
            }
            3 -> {
                for (i in scores.indices) {
                    println("scores[${i}]> ${scores[i]}")
                }
            }
            4 -> {
                var max = 0;  // 최고 점수
                var sum = 0;  // 평균 점수

                for (item in scores) {
                    sum += item
                    if (max < item) {
                        max = item
                    }
                }
                val avg:Double = (sum / studentNum).toDouble()

                println("최고 점수: ${max}")
                println("평균 점수: ${avg}")
            }
            5 -> {
                run = false
            }
        }

        // if문으로 작업
//        if (selectNo == 1) {
//            print("학생수> ")
//            studentNum = readln().toInt()
//            scores = IntArray(studentNum)
//            println(scores.toList())
//        } else if (selectNo == 2) {
//            for (i in scores.indices) {
//                print("scores[${i}]> ")
//                scores.set(i, readln().toInt())
//            }
//        } else if (selectNo == 3) {
//            for (i in scores.indices) {
//                println("scores[${i}]> ${scores[i]}")
//            }
//        } else if (selectNo == 4) {
//            var max = 0;  // 최고 점수
//            var sum = 0;  // 평균 점수
//
//            for (item in scores) {
//                sum += item
//                if (max < item) {
//                    max = item
//                }
//            }
//            val avg:Double = (sum / studentNum).toDouble()
//
//            println("최고 점수: ${max}")
//            println("평균 점수: ${avg}")
//        } else if (selectNo == 5) {
//            run = false
//        }
    }
}