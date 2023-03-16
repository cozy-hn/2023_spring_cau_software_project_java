import java.util.*;

public class Prob2 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int i = in.nextInt();
        System.out.println("50000 : " + i / 50000);
        i %= 50000;
        System.out.println("10000 : " + i / 10000);
        i %= 10000;
        System.out.println("1000 : " + i / 1000);
        i %= 1000;
        System.out.println("500 : " + i / 500);
        i %= 500;
        System.out.println("100 : " + i / 100);
        i %= 100;
        System.out.println("10 : " + i / 10);
        i %= 10;
        System.out.println("1 : " + i / 1);
        in.close();
    }
}
