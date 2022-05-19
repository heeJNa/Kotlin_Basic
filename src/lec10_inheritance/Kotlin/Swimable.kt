package lec10_inheritance.Kotlin

interface Swimable {
    val swimAbility: Int // 아래에서 구현 해줄 것이라고 생각
        get() = 3        // 직접 값을 넣어줄 수도 있다

    fun act(){
        println(swimAbility)
        println("어푸 어푸")
    }
}