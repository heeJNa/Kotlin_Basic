package lec15_Array.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaCollection {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(100,200);

        System.out.println(numbers.get(0));

        for(int number: numbers){
            System.out.println(number);
        }
        for(int i = 0 ; i< numbers.size();i++){
            System.out.printf("%s %s",i,numbers.get(i));
        }

        // Map JDK 8까지
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"MONDAY");
        map.put(2,"TUESDAY");

        // JDK 9부터
        Map.of(1,"MONDAY",2,"TUESDAY");

        for(int key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
