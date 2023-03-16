import java.util.*;

public class Prob3{
    public static void main(String[] args) throws Exception {
        System.out.println("length?");
        Scanner in= new Scanner(System.in);
        int[] i = new int[3];
        i[0] = in.nextInt();
        i[1] = in.nextInt();
        i[2] = in.nextInt();
        Arrays.sort(i);
        in.close();
        if (i[0]+i[1] <= i[2])
            System.out.println("No triangle");
        else
            System.out.println("Yes triangle");
    }
}
