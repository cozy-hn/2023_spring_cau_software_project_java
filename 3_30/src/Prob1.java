import java.util.*;

public class Prob1 {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        String[][] student= new String[8][6];
        student[0][0]="Name";
        student[0][1]="Korean";
        student[0][2]="English";
        student[0][3]="Math";
        student[0][4]="Sum";
        student[0][5]="Mean";
        student[6][0]="Sum";
        student[7][0]="Mean";
        Double sum;
        Double mean;
        Double Koreansum=0.0;
        Double Englishsum=0.0;
        Double Mathsum=0.0;
        for(int i=1;i<6;i++)
        {
            sum=0.0;
            for(int j=0;j<4;j++)
            {
                student[i][j]=in.next();
                if (j>0)
                    sum+=Double.parseDouble(student[i][j]);
                if (j==1)
                    Koreansum+=Double.parseDouble(student[i][j]);
                if (j==2)
                    Englishsum+=Double.parseDouble(student[i][j]);
                if (j==3)
                    Mathsum+=Double.parseDouble(student[i][j]);
            }
            mean=sum/3;
            student[i][4]=Double.toString(sum);
            student[i][5]=Double.toString(mean);
        }
        student[6][1]=Double.toString(Koreansum);
        student[7][1]=Double.toString(Koreansum/5);
        student[6][2]=Double.toString(Englishsum);
        student[7][2]=Double.toString(Englishsum/5);
        student[6][3]=Double.toString(Mathsum);
        student[7][3]=Double.toString(Mathsum/5);
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                if (i==0 || j==0)
                    System.out.printf("%10s",student[i][j]);
                else
                    System.out.printf("%10.2f",Double.parseDouble(student[i][j]));
            }
        System.out.println();
        }
        for(int i=6;i<8;i++)
        {
            for(int j=0;j<4;j++)
            {
                if (j==0)
                    System.out.printf("%10s",student[i][j]);
                else
                    System.out.printf("%10.2f",Double.parseDouble(student[i][j]));
            }
        System.out.println();
        }
        in.close();
    }
}
