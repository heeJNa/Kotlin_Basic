package lec10_inheritance.Kotlin

interface Flyable {
    // Kotlin에서 default 메소드를 구현 시 default 키워드가 필요 없다.
    fun act(){
        println("파닥 파닥")
    }
}