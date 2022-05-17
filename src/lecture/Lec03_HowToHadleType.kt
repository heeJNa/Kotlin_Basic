package lecture

fun main(){
    // 코틀린에서는 선언된 기본값을 보고 Type을 추론한다.
    val num1 = 1    // Int
    val num2 = 1L   // Long
    val num3 = 3.0f // Float
    val num4 = 3.0  // Double
    // JAVA에서는 기본 타입간의 형변환은 암시적으로 이루어질 수 있지만
    // kotlin에서는 명시적으로 이루어져야 한다.
    /* Ex)
           <JAVA>
                int number1 = 4;
                long number2 = number1;  자바에서는 큰타입으로 암시적으로 형변환 가능

               System.out.println(number1 + number2);
          위 코드를 코틀린으로 바꿔보겠다.
    */
    // Ex1
    val number1: Int = 4
    // var number2: Long = number1 오류발생
    val number2: Long = number1.toLong()
    print(number2)
    // Ex2
    val number3 = 3
    val number4 = 5
    val result = number3/number4.toDouble() // 실수의 값을 얻기위해서 한쪽에 명시적으로 toXxx() 형변환
    print(result)
    // null처리
    val number5: Int? = 3
    val number6= number5?.toLong() ?: 0L // number5가 null이 올 수 있으므로 Safe Call과 Elvis를 사용한다. (그냥 형변환시 에러발생)

}