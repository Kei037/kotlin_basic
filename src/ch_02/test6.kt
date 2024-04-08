package ch_02

fun main() {
    // for 문을 이용해서 arr 배열의 합을 구하세요
    val arr = intArrayOf(10, 20, 30, 40, 50)
    var sum = 0

    // 작성 위치
    // 1. until 사용
    for (i in 0 until  arr.size) {
        sum += arr[i]
    }
    println(sum)

    // 2. for in 사용
    sum = 0
    for (item in arr) {
        sum += item
    }
    println("sum = $sum")

    // 3. indices 사용
    println(arr.indices)  // 0..4
    sum = 0
    for (i in arr.indices ) {
        sum += arr[i]
    }
    println("sum = $sum")
}