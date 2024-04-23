package ch_08

/*
1. null 값 허용하기 : ?
코틀린에서 지정하는 기본 변수는 모두 null이 입력되지 않음.
null 값을 입력하기 위해서는 변수를 선언할 때 타입 뒤에 ? (Nullable, 물음표)를 입력

var variable: String?

1) 변수에 null 허용하기
변수의 타입 뒤에 물음표를 붙이지 않으면 null 값을 입력할 수 없음
null 예외를 발생시키고 싶지 않다면 기본형으로 선언
 */
fun main() {
    var nullable: String? // 타입 다음에 물음표를 붙여서 null 값을 입력할 수 있음.
    nullable = null

    var notNullable: String
//    notNullable = null // 일반 변수에는 null을 입력할 수 없음.
}

/*
2) 함수 파라미터에 null 허용 설정하기

함수의 파라미터에도 null 허용 여부를 설정할 수 있음.
함수의 파라미터가 null을 허용하려면 해당 파라미터에 대해서 null 체크를 먼저 해야만 사용할 수 있음.
 */
fun nullParameter(str: String?) {
    // 파라미터 str에 null이 허용되었기 때문에 함수 내부에서 null 체크를 하기 전에는 str을 사용할 수 없음
    if (str != null) {
        var length = str.length
    }
    val length = str?.length
}
/*
위의 코드처러 str 파라미터를 조건문에서 null인지 아닌지 체크해야만 사용할 수 있음

3) 함수의 리턴 타입에 null 허용 설정하기
함수의 리턴 타입에도 물음표를 붙여서 null 허용 여부를 설정할 수 있음
 */
fun nullReturn(): String? {
    return null
}
/*
함수의 리턴타입에 Nullable이 지정되지 않으면 null 값을 리턴할 수 없음


 */


