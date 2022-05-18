package lec08_Function;

public class JavaMain {
    public static void main(String[] args) {
        // 가변인자를 사용할 때는 배열을 직접 넣거나, comma를 이용해 여러 파라미터를 넣는다.
        String[] array = new String[]{"A","B","C"};
        printAll(array);
        printAll("A","B","C");
    }
    public int max(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public void repeat(String str, int num, boolean useNewLine){
        for(int i=1; i<=num; i++){
            if(useNewLine)
                System.out.println(str);
            else
                System.out.print(str);
        }
    }
    // Q. 많은 코드에서 useNewLine에 true를 사용한다면?
    // A. 오버로딩을 사용한다.
    public void repeat(String str,int num){
        repeat(str,num,true);
    }
    // Q. 많은 코드에서 출력을 3회씩 사용하고 있다면?
    // A. 한 번 더 오버로딩을 사용한다.
    public void repeat(String str){
        repeat(str,3,true);
    }

    public static void printAll(String... strings){ // 타입... 을 쓰면 가변인자 사용!
        for(String str: strings){
            System.out.println(str);
        }
    }
}
