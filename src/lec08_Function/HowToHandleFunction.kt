package lec08_Function

fun main(){
    repeat("Hello Kotlin")
    repeat("Hello World", useNewLine = false) // named argument
    // default값인 3을 다시 넣어주고 싶지 않아 매개변수 이름인 useNewLine 파라미터에 명시적으로 값을 대입.

    // #.named argument : Kotlin에서 Java 함수를 사용할 때는 named argument를 사용할 수 없다.
    //                      - 이유는 Kotlin에서 Java 코드를 사용할 때 JVM상에서 Java가 바이트 코드로 변환됐을 때 parameter name을 가지고 있지 않기 때문이다.
    printNameAndGender("FEMALE","김희준")  // parameter type이 같으면 바꿔서 값을 대입해도 컴파일단에서 확인할 수 없다.
                                                       // builder를 사용하면 조금 더 확인이 명확하게 되는 장점이 있었다.
    printNameAndGender(name = "김희준", gender = "MALE") // named argument를 사용하면 builder 만들지 않고 장점을 가지게 된다.

    // 가변인자 사용
    printAll("A","B","C")

    val array = arrayOf("A","B","C")
    printAll(*array) // 배열을 가변인자에 넣을때는 spread연산자 *를 앞에 써준다.
                     //                     ===========> 배열에 있는 것들을 마치 ,를 쓰는 것처럼 꺼내준다.
}
/*
    public fun max(a: Int, b: Int): Int {
        return if (a>b){
            a
        }else{
            b
        }
    }
    함수 문법 => 접근지시어 fun 함수이름(파라미터): 반환타입 { }
    1) public은 생략할 수 있다.
    2) fun은 함수를 의미하는 키워드이다.
    3) max는 함수의 이름이다.
    4) if-else는 하나의 expression이므로 return으로 받을 수 있다.
    5) 함수의 결과값이 하나면(body가 하나의 값으로 간주되는 경우) block 대신 = 사용 가능
    6) =을 사용하는 경우(block이 없다면) 반환 타입 생략 가능 (block {}을 사용하는 경우에는 반환 타입이 Unit이 아니면,
                                        명시적으로 작성해주어야 한다.)
    ** 함수는 클래스 안에 있을 수도, 파일 최상단에 있을 수도 있다. 또한, 한 파일 안에 여러 함수들이 있을 수 있다.
 */
fun max(a: Int, b: Int) = if (a>b) a else b

// #. default parameter (물론, Kotlin에도 Java와 동일하게 오버로딩이 존재한다)
fun repeat(
    str: String,
    num: Int =3,                // default parameter
    useNewLine: Boolean = true  // default parameter
){
    for (i in 1..num){
        if (useNewLine)
            println(str)
        else
            print(str)
    }
}

fun printNameAndGender(name: String,gender: String){
    println(name)
    println(gender)
}

// #. 같은 타입의 여러 파라미터 받기(가변인자)
fun printAll(vararg strings: String){ // vararg를 사용한다.
    for (str in strings)
        println(str)
}
