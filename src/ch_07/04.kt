package ch_07

fun main() {
    /*
    3. 클래스의 상속
    코틀린에서 클래스를 상속받으려면 부모 클래스에 open 키워드를 추가해야 함
    메서드도 자식 클래스에서 오버라이딩하려면 부모 클래스의 메서드에 open 키워드 추가
     */
    open class Flower {
        open fun waterFlower() {
            println("water flower")
        }
    }
    // 콜론 : 을 이용해 상속을 나타내면 됨
    class Rose: Flower() {
        override fun waterFlower() {
            super.waterFlower()
            println("Rose is water flower")
        }
    }

    val rose = Rose() // 객체 생성
    rose.waterFlower()
}