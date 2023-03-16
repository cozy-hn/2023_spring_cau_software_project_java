import java.util.*;

public class prob1 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Circle");
        int x = in.nextInt();
        int y = in.nextInt();
        int r = in.nextInt();
        System.out.println("Point");
        int a = in.nextInt();
        int b = in.nextInt();
        if (Math.pow(x-a,2)+Math.pow(y-b,2) <= Math.pow(r,2))
            System.out.print("This is in circle");
        else
            System.out.print("This is outcircle");
        in.close();
    }
}
