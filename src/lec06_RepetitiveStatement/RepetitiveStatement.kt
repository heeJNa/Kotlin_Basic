package lec06_RepetitiveStatement

fun main(){
    val numbers = listOf(1L,2L,3L) // 컬렉션 생성
    // Java에서는 :을 사용하지만 Kotlin에서는 in을 사용
    // Java와 동일하게 Iterable이 구현된 타입이면 in 뒤에 들어갈 수 있다.
    // for-each문
    for (number in numbers){ // number 앞에 type이 없다.
        println(number)
    }

    // 1부터 3까지 출력
    for (i in 1..3){
        println(i)
    }
    // 3부터 1까지 출력
    for (i in 3 downTo 1){ // Iterable이 구현되어 있다.
        println(i)
    }
    // 1부터 5까지 2씩 증가
    for (i in 1..5 step 2){
        println(i)
    }
    /*
            - .. 연산자 : 범위를 만들어 내는 연산자
            - IntRange라는 클래스가 있고 IntProgression(등차수열)을 상속받고 있다. (step은 기본적으로 1)
            - 등차수열은 시작값, 끝값, 공차(증가값)가 필요
            - downTo와 step도 함수이다. (중위 호출 함수) : 변수.함수이름(argument) 대신
                                                      변수 함수이름 argument 로 사용
     */
    // while과 do-while은 Java와 동일하다.
    var i = 1
    while (i<=3){
        println(i)
        i++
    }
}
