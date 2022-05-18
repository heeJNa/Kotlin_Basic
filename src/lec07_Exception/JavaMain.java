package lec07_Exception;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaMain {
    public static void main(String[] args) throws IOException{
        JavaMain main = new JavaMain();
        main.readFile();
    }
    private int parseIntOrThrow(@NotNull String str){
        try {
            return Integer.parseInt(str);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다",str));
        }
    }
    private Integer parseIntOrThrowV2(@NotNull String str){
        try {
            return Integer.parseInt(str);
        }catch (NumberFormatException e){
            return null;
        }
    }
    public void readFile() throws IOException{ // IOException은 CheckException
        File currentFile = new File("."); // 현재위치
        File file = new File(currentFile.getAbsolutePath()+"/a.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        reader.close();
    }
    // try with resources
    // try괄호 안에서 외부 resource를 만들어주고 자동으로 닫아준다.
    public void readFileV2(String path) throws IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            System.out.println(reader.readLine());
        }
    }
}

