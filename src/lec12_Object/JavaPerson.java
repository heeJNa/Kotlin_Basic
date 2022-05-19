package lec12_Object;

public class JavaPerson {
    private static final int MIN_AGE = 1;

    // 정적 팩토리 메소드
   public static JavaPerson newBaby(String name){
        return new JavaPerson(name,MIN_AGE);
    }
    private String name;
    private int age;

    private JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Kotlin의 companion object의 사용 법
        Person.Factory.newBaby("김희준");
        // 이름이 없다면 Person.Companion.newBaby("김희준"); 이렇게 사용한다.

        // 함수위에 @JvmStatic을 사용하면 바로 접근가능
        Person.newBaby("홍길동");

        // 익명의 클래스
        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("움직인다~~");
            }

            @Override
            public void fly() {
                System.out.println("난다~~");
            }
        });
    }

    private static void moveSomething(Movable movable){
        movable.move();
        movable.fly();
    }
}
