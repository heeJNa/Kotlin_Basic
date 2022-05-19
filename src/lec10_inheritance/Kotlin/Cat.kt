package lec10_inheritance.Kotlin

class Cat (
    species: String // type을 쓸때는 변수명뒤에 바로 : 을 붙인다.
) : Animal(species,4){ // 상속받을때는 extends 대신 한 칸 뛰고 : 을 붙여 줘야 한다.
    // 상속받을 클래스명 뒤에 상위 클래스의 생성자를 바로 호출한다.
    override fun move() { // override라는 지시어를 사용한다.
        println("고양이가 사뿐 사뿐 걸어갑니다.")
    }

}