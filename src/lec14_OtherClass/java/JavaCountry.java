package lec14_OtherClass.java;

public enum JavaCountry {
    // enum은 추가적인 클래스를 상속 받을 수 없다. 인터페이스는 구현 할 수 있으먀, 각 코드가 싱글톤이다.
    // 두 개의 enum 타입이 있다.
    KOREA("KO"),
    AMERICA("US");

    private final String code;

    JavaCountry(String code){this.code = code; }

    public String getCode() { return code; }
}
