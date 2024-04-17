package ch_07

import java.sql.DriverManager.println

/*
    4. 오브젝트
    오브젝트를 사용하면 클래스를 생성자로 인스턴스화 하지 않아도 블록 안의 프로퍼티와 메서드를 호출해서 사용할 수 있음.
    자바의 static과 같은 역할.
    */

object Cat {
    var name: String = "pinky"
    fun printName() {
        println("이름 : ${name}")
    }
}

fun main() {
    Cat.name = "mikey"
    Cat.printName()
}