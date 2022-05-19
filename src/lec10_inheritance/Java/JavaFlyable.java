package lec10_inheritance.Java;

public interface JavaFlyable {
    default  void act(){
        System.out.println("파닥 파닥");
    }
}
