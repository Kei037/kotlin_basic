package ch_06.ex
/*
아래의 프로그램을 완성하시오. 단 데이터베이스는 사용하지 말고 작업을 하고, account 프로그램의 구조를 참고하시오.
메뉴
1. 책 등록
2. 책 검색
3. 책 대여
4. 책 반납
5. 책 전체출력
6. 종료

* 책 등록시
등록할 책의 정보를 입력해 주세요.
코드 :
제목 :
작가 :
재고 숫자 :

* 책 대여시
대여할 책의 코드를 입력해 주세요
코드 : 111
대여 권수 : 2

재고가 충분한 경우 아래 문장을 출력하고 재고 권수에서 대여 권수를 뺌
2권이 대여되었습니다.

재고보다 대여권수가 많은 경우 아래의 문장을 출력
재고가 1권이여서 대여할 수 없습니다

* 책 반납
반납할 책의 코드를 입력해 주세요
코드 : 111
반납 권수 : 2

2권이 반납되었습니다.

* 책 검색시
검색할 책의 제목을 입력해 주세요.
제목 : 자바

검색한 책의 정보는 아래와 같습니다.
111 / 자바 정복 / 김철수 / 2권
222 / 자바 가이드 / 박수영 / 0권


* 책 전체 목록 출력시
등록된 책의 정보는 아래와 같습니다.
 */
class Book {
    var code: Int = 0
    var stock: Int = 0
    lateinit var title: String  // lateinit 지연초기화 (나중에 초기화함)
    lateinit var author: String
    override fun toString(): String {
        return "$code / $title / $author / ${stock}권"
    }
//    override fun toString(): String {
//        return "Book(code=$code, stock=$stock, title='$title', author='$author')"
//    }
    //  code; // 코드, title; // 제목, author; // 작가, stock; // 재고 숫자
}

class BookManager {
    // Book의 객체를 저장할 리스트
    private val books = mutableListOf<Book>()

    fun insertBook() {
        val book = Book()
        /* 책 등록 */
        println("등록할 책의 정보를 입력해 주세요.")

        print("코드: ")
        book.code = readln().toInt()
        print("제목: ")
        book.title = readln()
        print("작가: ")
        book.author = readln()
        print("재고: ")
        book.stock = readln().toInt()

        books.add(book)
        println("책이 등록되었습니다.")
    }

    fun searchByKeyWord() {
        val books2 = mutableListOf<Book>()
        /* 키워드로 책 검색 */
        println("검색할 책의 제목을 입력해 주세요.")
        print("제목: ")
        val bookTitle = readln()

        for (book in books) {
            if (book.title.contains(bookTitle)) {
                books2.add(book)
            }
        }
        if (books2.size > 0) {
            println("검색한 책의 정보는 아래와 같습니다.")
            for (book in books2) {
//            println("${book.code} / ${book.title} / ${book.author} / ${book.stock}권")
                println(book.toString())
            }
            return
        }
        println("검색된 책이 없습니다.")
    }

    fun printAll() {
        println("등록된 책의 정보는 아래와 같습니다.")
        for (book in books) {
//            println("${book.code} / ${book.title} / ${book.author} / ${book.stock}권")
            println(book.toString())
        }
    }

    private fun searchBookByCode(code: Int): Int {
        /* 코드로 책 찾기 */
        for (i in books.indices) {
            if (books[i].code == code) {
                return i
            }
        }
        return -1
    }

    fun rentBook() {
        /* 책 대여 */
        println("대여할 책의 코드를 입력해 주세요.")

        print("코드: ")
        val code = readln().toInt()
        print("대여 권수: ")
        val stock = readln().toInt()
        // 책의 코드로 책의 인덱스 값을 받아옴
        val index = searchBookByCode(code)

        if (index < 0) {  // 있으면 인덱스 번호를 반환, 없다면 -1
            println("입력하신 코드의 책은 없습니다.")
            return
        }

        if (books[index].stock < stock) {
            println("재고가 ${books[index].stock}권이여서 대여할 수 없습니다")
            return
        }
        books[index].stock -= stock
        println("${stock}권이 대여되었습니다.")
    }

    fun returnBook() {
        /* 책 반납 */
        println("반납할 책의 코드를 입력해 주세요.")
        print("코드: ")
        val code = readln().toInt()
        print("반납 권수: ")
        val stock = readln().toInt()

        val index = searchBookByCode(code)

        if (index < 0) {  // 있으면 인덱스 번호를 반환, 없다면 -1
            println("입력하신 코드의 책은 없습니다.")
            return
        }

        books[index].stock += stock
        println("${stock}권이 반납되었습니다.")
    }

}
fun main() {
    val manager = BookManager()
    while (true) {
        printMenu()
        print("선택: ")
        val choice: Int = readln().toInt()
        when (choice) {
            1 -> manager.insertBook()
            2 -> manager.searchByKeyWord()
            3 -> manager.rentBook()
            4 -> manager.returnBook()
            5 -> manager.printAll()
            6 -> {
                println("종료합니다.")
                return
            }

            else -> println("잘못누르셨습니다.\n다시선택해주세요.")
        }
    }
}
fun printMenu() {
    println("============Menu============")
    println("1. 책 등록")
    println("2. 책 검색")
    println("3. 책 대여")
    println("4. 책 반납")
    println("5. 책 전체출력")
    println("6. 종료")
    println()
}