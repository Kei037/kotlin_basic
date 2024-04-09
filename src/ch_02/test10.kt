package ch_02

fun main() {
    val numbers = IntArray(10)
    for (i in numbers.indices) {
        numbers[i] = i + 1
    }
    println("main() : ")
    for (i in numbers.indices) {
        print(numbers[i])
        if (i < numbers.size -1) {
            print(", ")
        }
    }
    println()
    printOdd(numbers)  // 2, 4, 6, 8
}

fun printOdd(numbers: IntArray) {
    println("printOdd() : ")
    for (i in numbers.indices) {
        if (numbers[i] % 2 == 0) {
            print(numbers[i])
            if (i < numbers.size -1) {
                print(", ")
            }
        }
    }
}
