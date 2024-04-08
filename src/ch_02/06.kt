package ch_02

fun main() {
    /*
    배열 객체는 Int, Long, Char 등과 같은 기본 타입 뒤에 Array를 붙여서 만듬
     */
    var students = IntArray(10) // students 에 Int(정수형) 공간을 10개 할당하라는 의미
    var longArray = LongArray(10)
    var charArray = CharArray(10)
    var floatArray = FloatArray(10)
    var doubleArray = DoubleArray(10)

    println(students[0])  // 0

    // 문자열 배열 빈 공간 할당하기
    // String은 기본 타입이 아니기 때문에 StringArray는 없지만 다음과 같이 사용 가능\
    // null 사용을 허용하지 않기 떄문에 빈 문자열로 초기화 해야 함
    var stringArray = Array(10, { item -> "" })
    println(stringArray[0])

    // 값으로 배열 공간 할당하기
    // arrayOf() 함수를 사용해서 String 값을 직접 할당할 수 있음
    var dayArray: Array<String> = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")
    println(dayArray[0])
    var intArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var intArray2: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(intArray[0].javaClass)
    println(intArray2[0].javaClass)

    // 배열에 값 입력하기
    students[0] = 90
    students.set(1, 91)
    println(students.toList())

    // 배열에 있는 값 꺼내기
    // 배열의 일곱번째 값을 seventhValue 변수에 저장
    var seventhValue = students[6]
    // 배열의 열번째 값을 tenthValue 변수에 저장
    var tenthValue = students.get(9)


}