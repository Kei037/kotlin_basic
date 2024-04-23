package ch_08

/*
2. 안전한 호출 : ?
변수를 Nullable로 만들기 위해 물음표 사용
?.(Safe Call, 물음표와 점)을 사용하려면 null 체크를 간결하게 할 수 있음

NullAble인 변수 다음에 ?.을 사용하면 해당 변수가 null일 경우 ?. 다음의 메서드나 프로퍼티를 호출하지 않음.
 */
fun testSafeCall(str: String?): Int? {
    // 문자열 길이를 반환하는 length 프로퍼티를 호출했는데 str 변수 자체가 null일 경우는 length 프로퍼티를 호출하지않고
    // null을 반환

    var result: Int? = str?.length
    return result
}
/*
Null 값 대체하기 : ?:
?:(Elvis Operator, 물음표와 콜론)을 사용하면 원본 변수가 null일때 넘겨줄 기본값을 설장할 수 있음.
 */
fun testElvis(str: String?): Int {
    // length 오른쪽에 ?:을 사용하면 null 일 경우 ?: 오른쪽 값이 반환.
    var resultNonNull: Int = str?.length ?: 0
    return resultNonNull
}
/*
물음표 위치와 형태에 따라 Nullable, Safe Call, Elvis Operator가 구분.
* Nullable
표기법 : 선언하는 변수의 타입 다음에 ? 표기.
사용 목적 : null을 입력받기 위해 사용
사용 예 : var nullable: String?

* Safe Call
표기법 : 선언하는 변수의 타입 다음에 ?. 표기.
사용 목적 : null일 때 ?. 다음에 나오는 속성이나 명령어를 처리하지 않기 위해 사용
사용 예 : var result = 변수?.length

* Elvis Operator
표기법 : 선언하는 변수의 타입 다음에 ?: 표기.
사용 목적 : null일 때 ?. 다음에 나오는 값을 기본 값으로 사용
사용 예 : var result = 변수 ?: 0
 */