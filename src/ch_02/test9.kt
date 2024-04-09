package ch_02

import kotlin.math.log

/*
login() 메서드와 logout() 메서드 선언
login() 메서드를 호출할 때는 매개값으로 id 와 passwd 를 제공하고
logout() 메서드는 id 만 매개값으로 제공

1) login() 메서드는 매개값 id가 "admin", 매개값 password 가 "1234" 일 경우에만
true 로 리턴하고 그 외의 값일 경우에는 false 로 리턴
2) logout() 메서드는 "admin 아이디가 로그아웃 되었습니다." 가 출력.
 */
fun main() {
    print("아이디를 입력해 주세요. >> ")
    val id = readln()
    print("비밀번호를 입력해 주세요. >> ")
    val password = readln()

    val result = login(id, password)  // true 대신 login()호출

    if (result) {
        println("로그인 되었습니다.")
        logout(id)
    } else {
        println("id 또는 password가 올바르지 않습니다.")
    }
}

fun login(id: String, passwd: String) : Boolean {
    return id == "admin" && passwd == "1234"
}
fun logout(id: String) {
    println("$id 아이디가 로그아웃 되었습니다.")
}