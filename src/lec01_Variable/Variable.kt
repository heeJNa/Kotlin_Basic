package lecture

fun main(){
        // var 혹은 val을 무조건 써줘야 한다.
        // 모든 변수들은 val로 생성하고 추후 꼭 필요한 변수만 var로 바꿔주면 깔끔한 코딩을 할 수 있다.
        // val로 생성된 컬렉션은 추가,제거는 가능하지만 컬렉션 자체를 바꾸는 것은 불가능 하다.
        // kotlin에서는 type 컴파일러가 자동으로 추론해준다. (primitive와 reference를 구분하지 않아도 됨)
        // 세미콜론 생략 가능
        /*
        *       Ex) Java
        *              final List<Integer> numbers = Arrays.asList(1,2);
        *              numbers.add(3) // 가능
        *              numbers = Arrays.asList(2,3) // 불가
        */
        var number1 = 100L; // var 키워드는 수정가능
        number1 = 5L;

        var number2 : Long = 100L // 직접 자료형 지정 가능.

        var number3 : Long // 자료형을 지정하면 값을 넣지않고 변수 선언 가능
//        println(number3)  값이 없으면 사용 불가


        val number4 = 100L; // read-only (Java에서의 final)
//        number4=5L;  val키워드가 사용된 변수는 변경할 수 없다.
        val number5 :Long // val도 자료형을 지정하면 값을 넣지않고 변수 선언 가능
        number5 = 5L // 최초 한번 초기값을 지정할 수 있다.
        println(number5)

        /*
        *   Ex) Java
        *       long number = 10L;       Primitive Type
        *       Long number = 1_000L;    Reference Type
        *
        *       코틀린에서는  var number : Long = 10L 로 쓰면 어떻게 구분하나?
        *
        *       코틀린 공식문서에 따르면 연산시에 코틀린이 알아서 적절하게 내부적으로 Primitive Type으로 바꾸어 연산한다.
        *       boxing과 unboxing을 고려하지 않아도 된다.
        *
        *       박싱(boxing)이란 기본형을 참조형으로 변환하는 것이고 언박싱(unboxing)이란 반대로 참조형을 기본형으로 바꾸는 것이다.
        * */

        // kotlin에서 Null을 사용하기 위해서는 변수? 를 사용해야 한다.
        var number6 : Long?
        number6 = null

        // Java에서는 new를 사용하여 객체를 인스턴스화 하지만 kotlin에서는 사용하지 않는다.
        // Ex) java => Person person = new Person("김희준")
        //     kotlin => var person = Person("김희준")
}
