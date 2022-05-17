package lecture

fun main() {
        // kotlin에서는 null이 들어간 타입을 완전히 다르게 취급한다.
        // null이 가능한 타입만을 위한 기능들
        // 1. Safe Call
        val str: String? = "ABC"
//      str.length     => str에 null이 들어올 수 있으므로 오류 발생
        str?.length // => str이 null이면 실행하지 않고(그대로 null반환) null이 아니면 실행한다. (Safe Call)
        // 2. Elvis
        str?.length ?: 0  // str이 null이면(앞에 연산결과가 null이면) ?: 뒤에 값을 사용한다. (Elvis)
        /*
        *       <Java>
        *           public boolean startsWithA(String str){
        *               return str.startsWith("A");
        *           }
        *           위 코드는 null이 들어올 수 있기에 안전하지 않은 코드이다.
        *           위 코드를 3가지 방법으로 안전하게 바꿀 수 있다.
        *               null이 들어오면...
        *               1. throw를 이용하여 예외를 발생시킨다.
        *               2. 그대로 null을 반환한다.
        *               3. false를 반환한다.
        *   아래에서 코틀린으로 작성해보겠다.
        */

        // 1번째 방법
        fun startsWithA1(str: String?): Boolean { // String에 ?를 붙여 null이 들어올 수 있음을 명시한다.
            // return str.startsWith("A") 를 바로 작성하면 오류가 난다.
            // 이유는 매개변수에 null이 들어올 수 있으므로 해결해야 하기 때문이다. (kotlin에서 막고있다.)
            return str?.startsWith("A")
                ?: throw IllegalArgumentException("null이 들어왔습니다.")
            /*  위와 아래는 같은 의미
            if (str == null) {
                throw IllegalArgumentException("null이 들어왔습니다.")
            }
            return str.startsWith("A")*/
        }

        // 2번째 방법
        fun startsWithA2(str: String?): Boolean? { // Boolean에도 ?를 붙여 null이 반환될 수 있음을 명시한다.
            return str?.startsWith("A")
            /*  위와 아래는 같은 의미
            if (str == null) {
                return null
            }
            return str.startsWith("A")*/
        }

        // 3번째 방법
        fun startsWithA3(str: String?): Boolean {
            return str?.startsWith("A") ?: false
            /*  위와 아래는 같은 의미
            if (str == null) {
                return false
            }
            return str.startsWith("A")*/
        }

        /*
            <JAVA>
                public long calculate(Long number){
                    if(number==null)
                        return 0;
                    // 다음 로직
                }
                자바에서의 early return validation을 아래와 같이 바꿀 수 있다.
         */
        fun calculate(number: Long?): Long{
            number ?: return 0  // Elvis연산을 사용하여 구현
            // 다음 로직
            return 1
        }

        // nullable Type이지만 아무리 생각해도 null이 올 수 없는경우 (null아님 단언!!)
        fun startsWithA4(str: String?): Boolean{
            return str!!.startsWith("A") // !!를 사용하여 이 변수는 절대 null이 아니라고 컴파일러에게 알림
            // 만약에 null이 들어오게 되면 컴파일시에는 오류가 없지만 런타임 오류로 NullpointException이 발생한다.
        }

        // Kotlin에서 Java코드를 가져다 사용할 때에 null처리 방법 (플랫폼 타입)
        /*
            <JAVA>
                public Class Person{
                    private final String name;

                    public Person(String name){
                        this.name=name;
                    }

                    @Nullable or @NotNull -----> null에 관한 Annotation을 Kotlin이 확인한다.
                    public String getName(){
                        return name;
                    }
                }
            <Kotlin>
                fun main(){
                    val person = Person("김희준")
                    startsWithA(person.name) // getName()을 호출
                    // getName()위 Annotation이 @Nullable일 경우 컴파일 오류발생 @NotNull이면 정상 수행
                }

                 fun startsWithA(str: String): Boolean{
                    return str.startWith("A")
                 }

             JAVA코드에서 @Nullable이 없다면 kotlin에서는 nullable인지 notnull인지 알 수가  없다.
             kotlin이 null 관련 정보를 알 수 없는 경우 Runtime시에 Exception이 발생할 수 있다.
             이러한 타입을 플랫폼 타입이라고 부른다.
         */

}