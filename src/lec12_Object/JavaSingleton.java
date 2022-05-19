package lec12_Object;

// 단 하나의 인스턴스만을 갖는 클래스 => 싱글톤
// 동시성 처리를 조금 더 해주거나 enum class를 활용하는 방법도 있다.
public class JavaSingleton {
    private static final JavaSingleton INSTANCE = new JavaSingleton();

    private JavaSingleton() { }

    public static JavaSingleton getInstance(){
        return INSTANCE;
    }
}
