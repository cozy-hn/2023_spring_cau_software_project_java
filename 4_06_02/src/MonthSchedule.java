import java.util.*;

public class MonthSchedule {
    Day[] days = new Day[30];
    
    MonthSchedule(int date)
    {
        for (int i=0; i<30; i++)
            days[i] = new Day();
    }

    void run()
    {
        int command;
        int date;
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.print("Command(Insert: 1, Show: 2, Quit: 3)>> ");
            command = in.nextInt();
            if (command==3)
            {
                System.out.print("This is the end of the program.");
                break;
            }
            else if (command==1)
            {
                System.out.print("Date(1-30)? ");
                date = in.nextInt();
                System.out.print("Do list (without space)? ");
                days[date-1].set(in.next());
            }
            else if (command==2)
            {
                System.out.print("Date(1-30)? ");
                date = in.nextInt();
                days[date-1].show();
                System.out.print(" on the "+date);
                if (date==1)
                    System.out.println("st.");
                else if (date==2)
                    System.out.println("nd.");
                else if (date==3)
                    System.out.println("rd.");
                else
                    System.out.println("th.");
            }
            else
                System.out.println("Wrong command!");
        }
        in.close();
    }
    
}
