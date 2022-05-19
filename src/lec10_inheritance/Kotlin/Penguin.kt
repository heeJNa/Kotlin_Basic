package lec10_inheritance.Kotlin

class Penguin(
    species: String
) : Animal(species,2), Swimable, Flyable { // 인터페이스 구현도 : 을 사용한다.
    private  val wingCount: Int =2

    override fun move() {
        println("펭귄이 움직입니다. 꿱꿱~")
    }
    override val legCount: Int // 상위 클래스의 프로퍼의 getter를 override 하기 위해서는
                               // 상위클래스 legCount에 open을 써줘야 한다.
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act() // 중복되는 인터페이스를 특정할때 super<타입>.함수 사용
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}