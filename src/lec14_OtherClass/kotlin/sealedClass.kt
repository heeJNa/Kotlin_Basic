package lec14_OtherClass
/*
     Sealed Class (하위 클래스를 제한)
        - 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
          즉, 런타임때 클래스 타입이 추가될 수 없다.
        - 하위 클래스는 같은 패키지에 있어야 한다.
        - Enum과 다른점
            - 클래스를 상속 받을 수 있다.
            - 하위 클래스는 멀티 인스턴스가 가능하다. (enum은 싱글톤)
        - 추상화가 필요한 Entity or DTO에 sealed class를 활용
 */
fun main(){
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar){
    when(car){
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}
sealed class  HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼",1_000L)

class Sonata : HyundaiCar("아반떼",1_000L)

class Grandeur : HyundaiCar("아반떼",1_000L)