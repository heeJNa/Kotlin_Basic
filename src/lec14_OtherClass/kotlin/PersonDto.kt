package lec14_OtherClass.kotlin

fun main(){
    val person = PersonDto("김희준",100)
    val person2 = PersonDto("김희준",200)
    println(person)
    println(person.equals(person2))
}
// data 키워드를 붙여주면 자동으로 equals, hashcode, toString을 만들어준다.
data class PersonDto(
    val name: String,
    val age: Int,
)