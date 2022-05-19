package lec12_Object

fun main(){
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    // 익명 클래스 사용
    moveSomething(object : Movable{
        override fun move() {
            println("움직인다~~")
        }

        override fun fly() {
            println("난다~~")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int
){
    // Kotlin에는 static이 없다. 대신 companion object(동행 객체) 사용 : 클래스와 동행하는 유일한 오브젝트
    // companion object는 하나의 객체로 간주된다. 때문에 이름을 붙일 수도 있고, interface를 구현할 수도 있다.
    // companion object에 유틸성 함수들을 넣어도 되지만, 최상단 파일을 활용하는 것을 추천한다.
    companion object Factory : Log{
        private const val MIN_AGE =1 // val만 쓰면 runtime 시에 값이 할당되지만 앞에 const를 붙여주면 컴파일시에 값이 할당된다.
                                     // const는 기본타입과 String에만 사용 가능
        @JvmStatic // Java에서 함수를 클래스 이름으로 바로 접근 가능
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요.")
        }
    }
}

// Kotlin의 싱글톤 생성
object Singleton{
    var a:Int = 0
}

// 익명 클래스 : 특정 인터페이스나 클래스를 상속받은 구현체를 일회성으로 사용할 때 쓰는 클래스(fun main에 구현)
private fun moveSomething(movable: Movable){
    movable.move();
    movable.fly();
}

