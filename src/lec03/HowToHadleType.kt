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
    println(number2)

    // Ex2
    val number3 = 3
    val number4 = 5
    val result = number3/number4.toDouble() // 실수의 값을 얻기위해서 한쪽에 명시적으로 toXxx() 형변환
    println(result)

    // null처리
    val number5: Int? = 3
    val number6= number5?.toLong() ?: 0L // number5가 null이 올 수 있으므로 Safe Call과 Elvis를 사용한다. (그냥 형변환시 에러발생)

    /*
        #.일반타입 형변환
           <JAVA>
                public static void printAgeIfPerson(Object obj){
                    if (obj instanceof Person) {        instanceof : 변수가 주어진 타입이면 true, 그렇지 않으면 false
                        Person person = (Person) obj;
                        System.out.println(person.getAge());
                    }
                }
           <Kotlin>
                #1
                    fun printAgeIfPerson(obj: Any){
                        if (obj is Person){             ==> is : java의 instanceof (obj가 Person이면 true, 그렇지 않으면 false를 반환)
                                                           !is : obj가 Person이 아니라면 true, 맞으면 false를 반환
                            var person = obj as Person  ==> obj가 Person이면 Person 타입으로 캐스팅, 아니면 예외 발생
                                                            이부분을 생략할 수 있다(스마트 캐스트)
                            println(person.age)
                        }
                    }
                #2 null이 포함
                    fun printAgeIfPerson(obj: Any?){     ==> obj가 null이 될 수 있다면
                        if (obj is Person){
                            var person = obj as? Person  ==> as뒤에도 ?를 붙여준다 : 1. obj가 null이 아니라면 Person 타입으로 변환
                                                                                 2. null이면 전체가 null이 된다.(person은 null)
                                                                                 3. obj가 Person 타입이 아니면 전체가 null이 된다.
                            println(person?.age)         ==> null이 올 수 있기 때문에 person뒤에 ?를 붙여야 한다. (Safe call)
                        }
                    }
     */
    /*
        #.Kotlin의 특이한 타입 3가지
            1) Any
                - Java의 Object 역할 (모든 객체의 최상위 타입)
                - 모든 Primitive Type의 최상위 타입도 Any이다.
                - Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면, Any?로 표현.
                - Any에 equals / hashCode / toString 존재.
            2) Unit
                - Unit은 Java의 void와 동일한 역할.
                - ** void와 다르게 Unit은 자체로 타입 인자로 사용 가능하다. (제네릭에서 사용)
                - 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미.
                  즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현.
            3) Nothing
                - Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할 (끝이 좋지 않은 함수)
                - 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
                ex)
                    fun fail(message: String): Noting {
                        throw IllegalArgumentException(message)
                    }
    */
    /*
        #.String interpolation / String indexing
            <JAVA>
                Person person = new Person("김희준",100);
                String log = String.format("사람의 이름은 %s이고 나이는 %s세 입니다",person.getName(), person.getAge());

                StringBuilder builder = new StringBuilder();
                builder.append("사람의 이름은");
                builder.append(person.getName());
                builder.append("이고 나이는");
                builder.append(person.getAge());
                builder.append("세 입니다");

            <Kotlin>
                val person = Person("김희준",100)
                val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다"  ==> ${변수}를 사용하면 값이 들어간다

                val name = "김희준"
                println("이름 : $name")  ==> $name이 김희준이 된다.

                Tip. ${변수}를 사용하는 것이 1)가독성 2) 일괄 변환 3) 정규식 활용 측면에서 더 좋다.
     */

    // 여러줄에 걸친 문자열을 작성할때 큰따옴표 세 개(""")를 사용하면 좀 더 편하게 작성할 수 있다.
    val name= "김희준"
    val str= """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)

    /*
         #.Java에서 문자열의 특정 문자 가져오기
            <JAVA>
                String str = "ABCDE";
                char ch = str.charAt(1);
            <Kotlin>
                val str = "ABCDE"
                val ch = str[1]
     */

}