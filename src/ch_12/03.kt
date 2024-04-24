package ch_12

fun main() {
    /*
    람다식

    Lambda Expression 은 람다 표현식, 람다라고도 불림
    람다식을 한 줄로 표현하면 '람다식은 마치 값처럼 다룰 수 있는 익명함수'

    일단 익명 함순느 이름 없이 정의되는 함수
     */
    val sayHello = fun() { println("Hello world!") }
    sayHello()
    /*
    람다식을 값처럼 다룰 수 있다는 말은, 람다식 자체가 함수의 인수가 되거나 반환값이 될 수 있다는 으미

    1. 람다식 정의
    람다를 이용하여, 인수 숫자의 제곱값을 반환
     */
    val squareNum: (Int) -> Int = { number -> number * number }
    println(squareNum(12))
    /*
    squareNum : 람다식을 저장할 변수의 이름을 지정
    (Int) : 람다식의 인수 자료형을 지정
    Int : 람다식의 반환 자료형을 지정. 이 경우에는 정수를 넣고 정수를 반환.
    number : 인수 목록으 나열. number 의 자료형은 자료형에서 명시해주었으므로 형추론이 되어 number는 Int가 됨.
    number * number : 람다식에서 실행할 코드를 지정
     */
    /*
    자료형은 인수목록에서 명시해주어도 됨.
    앞의 코드와 동일하게 작동하는 함수
     */
    val squareNum2 = { number: Int -> number * number }
    println(squareNum(11))
    /*
    또한 람다식의 인수가 한 개이면 인수를 생략하고 it으로 지칭할 수 있음
     */
    val squareNum3: (Int) -> Int = { it * it }
    println(squareNum3(12))
    /*
    2. 람다를 표현하는 다양한 방법
    람다는 '값처럼' 사용할 수 있는 익명 함수.
    값처럼 사용한다는 것은 함수의 인수로도 넣어줄 수 있다는 말
     */
    fun invokeLambda(lambda: (Int) -> Boolean): Boolean { // 람다식을 인수로 받음
        return lambda(5)
    }
    val paramLambda: (Int) -> Boolean = { num -> num == 10 }
    println(invokeLambda(paramLambda)) // 람다식의 인수로 넣은 5 != 10 이므로 false
    // 변수를 사용하지 않고도 바로 넣어줄 수도 있음
    // 다음의 람다식들은 모두 똑같이 작동
    invokeLambda({ num -> num == 10}) // 람다식 바로 넣어주기
    invokeLambda({it == 10}) // 인수가 하나일 때 it으로 변경 가능
    invokeLambda(){ it == 10} // 만약 함수의 마지막 인수가 람다일 경우 밖으로 뺄 수 있음.
    invokeLambda { it == 10 } // 그 외 인수가 없을 때 () 생략 가능

    /*
    3. SAM(Single Abstract Method) 변환

    안드로이드를 개발하다 보면 다음과 같은 코드를 아주 많이 작성하게 됨
    button.setOnClickListener {
        // 버튼이 눌렷을 때 작동할 코드
    }
    함수의 인수가 하나이고 람다식인 경우에 ()를 생략하고 {}에 코드를 작성할 수 있음.


    setOnClickListener() 함수는 람다식이 아닌 OnClickListener 인터페이스를 인수로 받음.
    public void setOnClickListener(@Nullable OnClickListener l) {
        if (!isClickable()) {
            setClickable(true);
        }
        getListenerInfo().mOnClickListener = l;
    }

    OnClickListener는 다음과 같이 추상 메서드 하나가 있는 인터페이스
	public interface OnClickListener {
        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        void onClick(View v);
    }

     setOnClickListener는 이와같이 람다식이 아님에도 마치 람다식처럼 취급되고 있음
     이것이 가능한 이유는 자바 8 에서 소개된 SAM변환
     SAM 변환는 두 가지 조건이 있음

     1. 코틀린 인터페이스가 아닌 자바 인터페이스여야 할 것
     2. 인터페이스 내에는 딱 한개의 추상 메서드만 조재할 것

     이 조건을 만족하는 경우 익명 인터페이스 객체 생성에 람다식을 사용할 수 있음
     람다식을 사용하면 코드가 훨씬 간결해지고 가독성이 높아짐
     */

}