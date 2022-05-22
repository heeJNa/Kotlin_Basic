package lec15_Array

fun main(){
    // Tip. 불변 리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸자!
    val numbers = listOf(100,200) // 불변 리스트
    val emptyList = emptyList<Int>() // emptyList는 <type>을 명시적으로 적어야 한다.
    printNumbers(emptyList()) // 함수 파라미터를 통해 type을 자동으로 추론

    println(numbers[0])

    for (number in numbers){
        println(number)
    }
    for((idx,value) in  numbers.withIndex()){
        println("${idx} ${value}")
    }

    // 가변 list
    val numbers2 = mutableListOf(100,200)
    numbers2.add(300)
    for (number in numbers2){
        println(number)
    }
    for((idx,value) in  numbers2.withIndex()){
        println("${idx} ${value}")
    }

    // 집합 set - 불변
    val numbers3 = setOf(100.200)
    for (number in numbers3){
        println(number)
    }
    for((idx,value) in  numbers3.withIndex()){
        println("${idx} ${value}")
    }
    // 가변 집합 -mutableSet
    val number4 = mutableSetOf(100,200)

    // Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"//oldMap.put(1,"MONDAY")
    oldMap[2] = "TUESDAY" // oldMap.put(2,"TUESDAY")

    mapOf(1 to "MONDAY", 2 to "TUESDAY") // 불변

    for (key in oldMap.keys){ // keys라는 파라미터를 만들어 놓음
        println(key)
        println(oldMap[key])
    }

    for((key,value ) in oldMap.entries){ // entries라는 파라미터를 만들어 놓음
        println(key)
        println(value)
    }

    // collection null
    /*
        List<Int?>  : 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
        List<Int>?  : 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
        List<Int?>? : 리스트에 ㅜull이 들어갈 수도 있고, 리스트가 null일 수도 있음
     */

    // Java는 읽기 전용 컬렉션과 변경 가능 컬렉션을 구분하지 않는다.
    // Java는 불변/가변과 nullable/non-nullable을 구분하지 않는다.
    // Kotilin 쪽의 컬렉션이 Java에서 호출되면 컬렉션 내용이 변할 수 있음을 감안해야 한다.
    // Kotlin에서 Java에도 있는 Collections.unmodifableXXX()를 활용하면 변경 자체를 막을 수 있다.
    // Kotlin에서 Java 컬렉션을 가져다 사용할때 플랫폼 타입을 신경써야 한다. (플랫폼 타입 해결방법 사용)
}

private fun printNumbers(numbers: List<Int>){

}