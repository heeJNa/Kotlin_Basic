package lec10_inheritance.Kotlin

fun main(){
    Derived(300) // 실행하면 Base Class  -> 0 -> Derived Class 순으로 출력된다.
                         // 0이 나오는 이유는 Derived를 인스턴스화 하는 것은 Derived에 있는 number에 값을 집어 넣는 것인데
                         // 이때 상위 클래스에서 number를 호출하게되면 하위 클래스의 number을 가져오게 되는데 상위클래스의 init메소드가 먼저
                         // 실행되고 있는 중이기 때문에 하위 클래스의 number가 아직 초기화가 되지 않아서 0(int의 기초값)이 출력된다.
}

open class Base(
    /*
        상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다.
            1. final : override를 할 수 없게 한다. default로 보이지 않게 존재한다.
            2. open : override를 열어 준다.
            3. abstract : 반드시 override 해야 한다.
            4. override : 상위 타입을 오버라이드 하고 있다.
     */
    open val number: Int = 100
){
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number){
    init {
        println("Derived Class")
    }
}