package lec14_OtherClass.java;

public class JavaMain {

    public static void main(String[] args) {
        handleCountry(JavaCountry.KOREA);
    }

    private static void handleCountry(JavaCountry country){
        if (country == JavaCountry.KOREA){
            // 로직 처리
        }
        if (country == JavaCountry.AMERICA){
            // 로직 처리
        }
    }
}
