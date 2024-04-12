package ch_06

fun main() {
    /*
    3. 맵 Map
    맵은 키 Key와 값 Value의 쌍으로 입력되는 컬렉션

    키는 중복불가
    제네릭으로 키와 값의 데이터 타입을 지정해서 맵을 생성.
    맵의 요소는 Pair(A, B) 를 사용하는데 이는 A to B 로도 표현할 수 있음.
     */
    // 읽기 전용 맵
    val immutableMap = mapOf("name" to "tom", "age" to 28, "age" to 20, "height" to 170)
    println(immutableMap)

    // 맵 생성하기
    var map = mutableMapOf<String, String>()

    // 값 추가하기
    map.put("키1", "값1")
    map.put("키2", "값2")
    map.put("키3", "값3")

    // 맵 사용하기
    println("map 에 입력된 키1의 값은 ${map.get("키1")}입니다.")

    // 맵 수정하기
    map.put("키2", "수정한 값")
    map["키2"] = "수정한 값"
    println("map 에 입력된 키2의 값은 ${map.get("키2")}입니다.")

    // 맵 삭제하기
    map.remove("키1")
    // 없는 값을 불러오면 null 값이 출력됨
    println("map 에 입력된 키1의 값은 ${map.get("키1")}입니다.")


}