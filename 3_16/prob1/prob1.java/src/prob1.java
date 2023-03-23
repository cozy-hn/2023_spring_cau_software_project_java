import java.util.*;

public class Prob1{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Circle");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double r = in.nextDouble();
        System.out.println("Point");
        double a = in.nextDouble();
        double b = in.nextDouble();
        if (Math.pow(x-a,2)+Math.pow(y-b,2) <= Math.pow(r,2))
            System.out.print("This is in circle");
        else
            System.out.print("This is outcircle");
        in.close();
    }
}
