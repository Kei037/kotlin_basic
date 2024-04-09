package ch_02
/*

 */
fun main() {
    val max = 3
    val anos = Array(max, {""}) // 통장번호
    val owners = Array(max, {""}) // 예금주
    val balances = IntArray(max) // 잔액
    var idx = 0 // 생성된 계좌수
    var run = true

    while (run) {
        println("----------------------------------------------------------")
        println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료")
        println("----------------------------------------------------------")
        print("선택> ")

        val selectNo: Int = readln().trim().toInt()
        when (selectNo) {
			1 -> idx = createAccount(idx, max, anos, owners, balances)
			2 -> viewAccountList(idx, anos, owners, balances)
			3 -> deposit(idx, anos, owners, balances)
			4 -> withdraw(idx, anos, owners, balances)
			5 -> viewAccount(idx, anos, owners, balances)
            6 -> run = false
        }
    }
    println("프로그램 종료")
}
fun createAccount(idx: Int, max: Int, anos: Array<String>, owners: Array<String>, balances: IntArray): Int {
    if (idx >= max) {
        println("생성 가능한 계좌의 범위를 초과했습니다.")
    } else {
        println("--------------")
        println("계좌생성")
        println("--------------")

        print("계좌번호: ")
        val ano: String = readln()

        print("계좌주: ")
        val owner: String = readln()

        print("초기입금액: ")
        val balance: Int = readln().toInt()

        if (ano != null && owner != null && balance != null && balance >= 0) {
            anos[idx] = ano
            owners[idx] = owner
            balances[idx] = balance
            println("결과: 계좌가 생성되었습니다.")
            return idx + 1
        } else {
            println("입력이 잘못되었습니다.")
        }
    }
    return idx
}
fun viewAccountList(idx: Int, anos: Array<String>, owners: Array<String>, balances: IntArray) {
    println("--------------")
    println("계좌목록")
    println("--------------")

    for (i in 0 until idx) {
        println("${anos[i]} ${owners[i]} ${balances[i]}")
    }

}

fun deposit(idx: Int, anos: Array<String>, owners: Array<String>, balances: IntArray) {
    TODO("Not yet implemented")
}

fun withdraw(idx: Int, anos: Array<String>, owners: Array<String>, balances: IntArray) {
    TODO("Not yet implemented")
}

fun viewAccount(idx: Int, anos: Array<String>, owners: Array<String>, balances: IntArray) {
    println("--------------")
    println("조회")
    println("--------------")
    println()
    print("계좌번호: ")

    val ano: String = readln()

    for (i in 0 until  idx) {
        if (ano == anos[i]) {
            println("${anos[i]} ${owners[i]} ${balances[i]}")
        }
    }
}

/*
while문과 readln를 이용해서 키보드로 입력된 데이터로 계좌생성, 계좌목록, 예금, 출금,  조회, 종료 기능을 제공하는 코드를 완성하세요.
    아래의 사항을 지켜 작업을 하세요.
    1) main 함수의 계좌생성, 계좌목록, 예금, 출금, 조회, 종료의 동작 구분은 when 으로 작성.
    2) main() 함수는 아래의 변수만 사용할 것.
	val max = 3
	val anos = Array<String>(max, {""}) // 통장번호
	val owners = Array<String>(max, {""}) // 예금주
	val balances = IntArray(max) // 잔액
	var idx = 0 // 생성된 계좌수

    4) 모든 코드의 for문은 idx를 사용할 것.

    5) 계좌 생성의 경우 createAccount() 함수가 실행되도록 할 것.
    계좌 생성을 위한 정보를 입력받고 각각의 배열에 저장.
    허용 가능한 통장의 개수 (max)이상의 통장을 개설하려는 경우에는 에러메시지를  출력하고 객체 생성을 하지 않음.
    반복문을 사용하지 말고 구현할 것.
    6) 계좌목록의 경우 viewAccountList() 함수가 실행되도록 할 것.
    현재 개설된 전체 계좌 목록이 출력되도록 함.
    반복문에서는 idx를 사용할 것.
    7) 예금의 경우 deposit() 함수가 실행되도록 할 것.
    계좌번호와 입금액을 입력받고 해당 계좌번호의 잔액 증가 처리.
    0원이나 마이너스 금액을 입금하고자 하면 에러메시지가 나오고, 증가 처리를 하지 않음.
    해당 계좌번호가 없으면 에러메시지가 나옴.
    8) 출금의 경우 withdraw() 함수가 실행되도록 할 것.
    계좌번호와 출금액을 입력받고 해당 계좌번호의 잔액 차감 처리.
    0원이나 마이너스 금액을 출금하고자 하면 에러메시지가 나오고, 차감 처리를 하지 않음.
    잔액보다 더 많은 금액을 출금하고자 하면 에러메시지가 나오고, 차감 처리를 하지 않음.
    해당 계좌번호가 없으면 에러메시지가 나옴.
    9) 조회의 경우 viewAccount() 메서드가 실행되도록 할 것.
    계좌번호를 입력받고 해당 계좌번호의 정보를 보여줌.
    해당 계좌번호가 없으면 에러메시지가 나옴.
    10) 예금, 출금, 조회에서 해당 계좌번호를 찾는 코드는 따로 함수화 시킴.
    메서드 이름은 findAccount()으로 함.

1. 계좌 생성

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 1

--------------

계좌생성

--------------

계좌번호: 123

계좌주: 홍길동

초기입금액: 1000

결과: 계좌가 생성되었습니다.

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 1

--------------

계좌생성

--------------

계좌번호: 234

계좌주: 박수동

초기입금액: 2000

결과: 계좌가 생성되었습니다.

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 1

--------------

계좌생성

--------------

계좌번호: 345

계좌주: 김길수

초기입금액: 3000

결과: 계좌가 생성되었습니다.

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 1

생성 가능한 계좌의 범위를 초과했습니다.

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택>



2. 계좌목록

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 2

--------------

계좌목록

--------------

123 홍길동 1000

234 박수동 2000

345 김길수 3000

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택>





3. 계좌 조회

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 5

--------------

조회

--------------

계좌번호: 567

결과: 계좌가 없습니다.

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 5

--------------

조회

--------------

계좌번호: 234

234 박수동 2000

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택>



4. 예금



----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 5

--------------

조회

--------------

계좌번호: 234

234 박수동 2000

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 3

--------------

예금

--------------

계좌번호: 234

예금액: -100

0원 이상만 입금가능합니다.

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 3

--------------

예금

--------------

계좌번호: 234

예금액: 100

결과: 예금이 성공되었습니다.

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 5

--------------

조회

--------------

계좌번호: 234

234 박수동 2100

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택>



5. 출금

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 5

--------------

조회

--------------

계좌번호: 234

234 박수동 2000

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 4

--------------

출금

--------------

계좌번호: 234

출금액: 3000

결과: 잔액보다 출금액이 커서 출금에 실패했습니다.

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 4

--------------

출금

--------------

계좌번호: 234

출금액: 100

결과: 출금이 성공되었습니다.

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택> 5

--------------

조회

--------------

계좌번호: 234

234 박수동 1900

----------------------------------------------------------

1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료

----------------------------------------------------------

선택>
 */