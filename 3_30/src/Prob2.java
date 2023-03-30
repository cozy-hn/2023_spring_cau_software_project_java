import java.util.*;

public class Prob2 {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
                System.out.printf(" ");
            for(int j=i;j>0;j--)
                System.out.printf("%d",j);
            for(int j=0;j<=i;j++)
                System.out.printf("%d",j);
            System.out.println();
        }
        in.close();
    }
}
