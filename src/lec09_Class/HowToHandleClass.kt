package lec09_Class

fun main(){
    val person = Person("김희준",100)
    println(person.name) // name 필드의 getter를 호출
    person.age=10 // age 필드의 setter를 호출
    println(person.age)

    // Java의 class도 동일하게 사용 가능
    val javaPerson = JavaPerson("김희준",100)
    println(javaPerson.name) // name 필드의 getter를 호출
    person.age=10 // age 필드의 setter를 호출
    println(javaPerson.age)

    val person2 = Person2() // name은 홍길동 age는 1로 자동으로 생성
    // 실행 순서는 초기화 블록 body -> 첫번째 부생성자 body -> 두번째 부생성자 body 순으로 호출된다.
    println(person2.name)
    println(person2.age)
    println(person2.getUppercaseName)
}

// Kotlin의 클래스는 디폴트로 final public이다. 그래서 상속 받기 위해서는 open을 사용
//           ===================================> 위쪽에 생성자가 위치한다.(constructor은 생략가능)
class Person constructor(name: String, age: Int){ // public은 생략할 수 있다.
                       //======================= 위 프로퍼티에 val과 var을 써줌으로써 아래 body를 생략 가능
    val name = name // type 생략가능
    var age = age
    // Kotlin에서는 필드를 생성하면 자동으로 getter/setter를 만들어준다.
}
//이렇게 생략 할 수 있다.
class Person2( // 이 부분을 주생성자라고 부르고 반드시 존재해야 한다.(단, 주생성자에 파라미터가 하나도 없으면 생략 가능)
    // Kotlin에서는 부생성자 보다 default parameter를 더 권장한다.
    // Converting과 같이 어떤 객체를 다른 객체로 바꾸는 경우에는 부생성자를 사용할 수 있지만,
    // 정적 팩토리 메소드를 추천한다.
    val name: String = "김희준", // getter/setter를 custom하기 위해 val를 빼준다.
    var age: Int = 1
) {

    /*
    <Setter> Setter 자체를 지양하기 때문에 custom setter는 잘 사용하지 않는다.
        var name: String = name
            set(value) {
                field = value.uppercase()
            }
    <Getter>
    val name = name  주생성자에서 받은 name을 불변 프로퍼티 val name에 대입해준다.
         get() = field.uppercase()
         get() = name.uppercase()  이와 같이 쓰게되면 밖에서 name을 호출했을 때 getter가 불리게되고
                                   안에 name이 또 있기 때문에 get()이 호출되면서 무한루프 발생
                                   해결하기 위해 field 키워드를 사용한다.
    field는 자기 자신을 가리키는 보이지 않는 field라고 해서 backing field라고 부른다.
    하지만 아래와 같이 함수나 custom getter를 만들어서 주로 사용한다.
    <Function>
    fun getUppercaseName(): String{
        return this.name.uppercase()
    }
    */
    val getUppercaseName: String
        get() = this.name.uppercase()

    // 생성자가 호출되는 시점에 실행된다. 값을 적절히 만들어주거나, validation 하는 로직을 주로 사용
    init {
        if (age <= 0){
            throw IllegalArgumentException("나이는${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }
    // 생성자를 추가하고 싶을때는 constructor 키워드를 사용하여 생성한다.(부생성자)
    constructor(name: String): this(name, 1){ // 부생성자는 최종적으로 주생성자를 this로 호출해야 한다.
    // body를 가질 수 있다.       ================== 위에 있는 주 생성자를 호출
        println("첫번째 부생성자")
    }
    constructor(): this("alies"){
        println("두번째 부생성자")
    }
    /*
        fun isAdult(): Boolean{
            return this.age>=20
        }
    */
    // 위 함수를 custom getter로 property처럼 보이게 하는 방법이 있다.(함수 대신 프로퍼티처럼 만들 수 있다.)
    // 객체의 속성을 나타내는 것이라면 custom getter를 쓰고 그렇지 않으면 함수를 쓰는 것이 좋다.
    val isAdult: Boolean
        get() = this.age >= 20;
    /*
        위 코드와 아래 코드는 같다. this.age >= 20 부분이 하나의 expression이므로 =으로 받을 수 있다.
        get(){
            return this.age >= 20
        }
     */
}



