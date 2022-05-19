package lec10_inheritance.Java;

public interface JavaSwimable {
    default void act(){
        System.out.println("어푸 어푸");
    }
}
