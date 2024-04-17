package ch_07

/*
    5. 추상 클래스
    추상 클래스는 그 자체로는 객체를 만들 수 없는 클래스로, 일반적으로 추상 메서드가 포함된 클래스를 말함.
    추상 메메서드란 아직 구현되지 않고 추상적으로만 존재하는 메서드

    추상 클래스와 추상 메서드 앞에는 abstract 키워드를 붙임
    상속받는 자식 클래스에 특정 '메서드 구현을 강제' 하고 싶을 때 사용
    추상 클래스 자체로는 직접 객체를 만들 수 없고 자식 클래스에서 추상 메서드를 구현한 다음,
    자식 클래스의 객체를 생성하면 됨
     */
abstract class Game {
    fun startGame() {
        println("게임을 시작했습니다.")
    }
    // 추상 메서드
    abstract fun printName()
}

class OverWatch : Game() {
    override fun printName() { // 추상메서드 구현
        println("오버워치입니다.")
    }

}

fun main() {
    val overWatch = OverWatch()
    overWatch.startGame() // Game 클래스 메서드
    overWatch.printName() // OverWatch 클레스에서 구현한 메서드
}