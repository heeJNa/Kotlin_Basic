package lec05

fun main(){

}

fun validateScoreIsNotNegative(score: Int){ // Unit(void)가 생략되었다.
    if (score<0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.") // new를 사용하지 않음
    }
}

fun getPassOrFail(score: Int): String{
    // if문을 return 할 수 있다. (Expression이기 때문이다.)
    // Kotlin에서는 if-else를 expression으로 사용할 수 있기 때문에 삼항 연산자가 없다.
    return if(score>=50){
         "P"
    }else{
         "F"
    }
}
/*
     Java에서 if-else는 Statement이지만, Kotlin에서는 Expression이다.
     Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
                    ex) JAVA에서
                            String grade = if(score>=50){
                                                return "P"
                                            }else{
                                                return "F"
                                            }
                                      이렇게 사용할 수 없다. (if문을 하나의 값으로 취급하지 않기 때문이다.)
                        삼항 연산자는 Expression이면서 Statement이다.
     Expression : 반드시 하나의 값으로 도출되는 문장 (Statement에 포함된다)
 */
fun getGrade(score: Int): String{
    // if-else if-else 도 하나의 Expression이다.
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}
 /*
     Tip. 어떠한 값이 특정 범위에 포함되어 있는지, 포함되어 있지 않은지
      <JAVA>   if(0 <= score && score<=100)
      <Kotlin> if(score in 0..100) : score가 0~100 사이에 있으면...
               if(score !in 0..100) : score가 0~100 사이에 있지 않으면...
*/

fun getGradeWithSwitch(score: Int): String{
     /*
         1) Kotlin에는 Switch case문이 없어졌다.
         2) if와 마찬가지로 when도 하나의 Expression이므로 바로 return이 가능하다.
         3) 조건부에는 어떠한 expression이라도 들어갈 수 있다 ex) is Type
         4) 여러개의 조건을 동시에 검사할 수 있다 (,로 구분)
         5) when(값)에서 값이 없을 수도 있다 - early return 처럼 동작
         6) when은 Enum Class 혹은 Sealed Class와 함께 사용할 경우, 더욱 더 진가를 발휘한다.
     */
    return when(score/10){
        9,10 -> "A" // in 90..100 -> "A"
        8 -> "B" // in 80..89 -> "B"
        7 -> "C" // in 70..79 -> "C"
        else -> "D"
    }
}
fun startsWithA(obj: Any): Boolean{
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int){
    when(number){
        1,0,-1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다")
    }
}
fun judgeNumber2(number: Int){
    when{
        number==0 -> println("주어진 숫자는 0입니다.")
        number % 2 ==0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}
