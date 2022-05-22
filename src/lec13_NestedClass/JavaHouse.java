package lec13_NestedClass;

public class JavaHouse {

    private String address;
    private LivingRoom livingRoom;

    public JavaHouse(String address, LivingRoom livingRoom) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    /*
        Effective Java
        1. 내부 클래스는 숨겨진 외부 클래스 정보를 가지고 있어, 참조를 해지하지 못하는 경우
           메모리 누수가 생길 수 있고, 이를 디버깅 하기 어렵다.
        2. 내부클래스 직렬화 형태가 명확하게 정의되지 않아 직렬화에 있어 제한이 있다.
        3. 클래스 안에 클래스를 만들 때는 static 클래스를 사용하라
     */
    public static class LivingRoom{
        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }

        // static 사용시 바깥 클래스를 사용할 수 없다.
//        public String getArea() {
//            return JavaHouse.this.address;
//        }
    }
}
