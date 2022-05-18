package lecture

import lec04.JavaMoney
import lec04.KotlinMoney

fun main(){
    /*
        1. 단항 연산자(++. --) / 산술 연산자(+,-,*,/,%) / 산술 대입 연산자(+=,-=,*=,/=,%=)
            Java와 Kotlin 동일하게 사용
        2. 비교 연산자(<,>,<=,>=)
            일반적으로 Java와 동일하나 Java와 다르게 객체를 비교할때
            비교 연산자를 사용하면 자동으로 compareTo를 호출한다.
            <Java>
                JavaMoney money1 = new JavaMoney(2_000L);
                JavaMoney money2 = new JavaMoney(1_000L);

                if(money1.compareTo(money2)>0){
                    System.out.println("Money1이 Money2보다 금액이 큽니다");
                }
            위 코드를 Kotlin으로 바꿔보겠다.
    */
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2){ // >가 자동으로 compareTo를 호출한다.(쉽게 이해가능)
        println("Money1이 Money2보다 금액이 큽니다")
    }
    /*
             동등성(Equality) : 두 객체의 값이 같은가?
             동일성(Identity) : 완전히 동일한 객체인가? 즉 주소가 같은가?

             - Java에서는 동일성에 ==를 사용, 동등성에 equals를 직접 호출
             - Kotlin에서는 동일성에 ===를 사용, 동등성에 ==를 호출
               ==를 사용하면 간접적으로 equals를 호출해준다

               <Java>
                     JavaMoney money1 = new JavaMoney(1_000L);
                     JavaMoney money2 = new JavaMoney(1_000L);
                     JavaMoney money3 = money1;

                     System.out.println(money1 == money3); // true
                     System.out.println(money1 == money2); // false
                     System.out.println(money1.equals(money2)); //true
               위 코드를 Kotlin으로 바꿔보겠다.
     */
    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money4) //true
    println(money3 === money5) // false : 주소를 비교
    println(money3 == money5) // true : 값을 비교
    /*
         3. 논리 연산자 (&&,||,!)
            - Java와 완전히 동일하다.
            - Java처럼 Lazy 연산을 수행한다.
     */

    // Lazy 연산
    fun fun1(): Boolean{
        println("fun 1")
        return true
    }
    fun fun2(): Boolean{
        println("fun 2")
        return false
    }
    if (fun1() || fun2()){ // fun1()이 true이기 때문에 뒤에 fun2()를 실행하지 않고 "본문" 출력
        println("본문")
    }

    /*
           4. Kotlin에 있는 특이한 연산자
                - in/!in
                    - 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다.
                - a..b
                    - a부터 b까지의 범위 객체를 생성한다.
                - a[i]
                    - a에 특정 Index i로 값을 가져온다. (String에서 사용)
                - a[i] = b
                    - a의 특정 index i에 b를 넣는다.
            5. 연산자 오버로딩
                - Kotlin에서는 객체마다 연산자를 직접 정의할 수 있다.
     */
    // Kotlin class인 Money사용
    val money6 = KotlinMoney(1_000L)
    val money7 = KotlinMoney(2_000L)
    println(money6 + money7) // +가 오버로딩 되어 있다. toString()도 구현되어 있다.

}

