import java.util.*;

public class Prob1{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++)
            a[i]=in.nextInt();
        double sum = 0.0;
        double sumpow = 0.0;
        for(int i=0;i<a.length;i++)
            sum += a[i];
        double mean = sum/(double)a.length;
        for(int i=0;i<a.length;i++)
            sumpow += Math.pow(a[i]-mean, 2);
        double var = sumpow/(double)a.length;
        System.out.println(mean);
        System.out.println(var);
        in.close();
    }
}
