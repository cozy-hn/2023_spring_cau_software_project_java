import java.util.*;

public class Prob2 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        String str_=in.nextLine();
        String[] strarr= str_.split(",");
        for (int i=0;i<strarr.length;i++)
        {
            if(strarr[i].contains("java"))
            {
                System.out.println("true");
                System.out.println(strarr[i].replaceAll("java","python"));
            }
            else
                System.out.println("false");

        }
        in.close();
    }
}
