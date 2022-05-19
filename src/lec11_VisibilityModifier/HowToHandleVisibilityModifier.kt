package lec11_VisibilityModifier

/*
        #.Kotiln에서의 가시성 제어(접근 제어)
          <Kotlin 클래스>
              - public : 모든 곳에서 접근 가능
              - protected : 선언된 클래스 또는 하위 클래스에서만 접근 가능 (Kotlin 에서는 패키지를 namespace를 관리하기 위한 용도로만 사용하기 때문이다.)
              - internal : 같은 모듈에서만 접근 가능 (모듈은 한 번에 컴파일 되는 Kotlin 코드)
              - private : 선언된 클래스 내에서만 접근 가능
          *. Java의 기본 접근 지시어는 default, Kotlin의 기본 접근 지시어는 public 이다.
          *. 생성자도 가시성 범위는 동일하다. 단, 생성자에 접근 지시어를 사용하려면 construction 키워드를 사용해야 한다.

          <Kotlin 파일>
          *. .kt 파일에는 여러개에 변수, 함수, 클래스를 만들 수 있다.
            - public : 기본값, 어디서든 접근할 수 있다.
            - protected 파일(최상단)에는 사용 불가능(클래스에서만 작동)
            - internal : 같은 모듈에서만 접근 가능
            - private : 같은 파일에서만 접근 가능

          <Kotlin 프로퍼티>
          *. val이나 var 앞에 접근지시어를 사용해 getter나 setter 한 번에 접근 지시어를 정할 수 있다.
          *. getter와 setter의 가시성을 다르게 하고 싶은 경우
                ex)
                    var price = _price
                        private set
                     이와 같이 set이나 get 앞에 접근 지시어를 사용하면 된다.

          <Java와 Kotlin을 함께 사용할 때 주의할 점>
            - Internal은 바이트 코드 상 public이 된다. 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드를 가져올 수 있다.
            - Java는 같은 패키지의 Kotlin protected 멤버에 접근할 수 있다.
 */

class Car(
    internal val name: String, // getter와 setter 모두 internal
    private val owner: String, // getter와 setter 모두 private
    _price: Int
){
    var price = _price // 앞에 public 생략
       private set
}
