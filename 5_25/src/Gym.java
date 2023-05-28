import java.util.Scanner;

public class Gym {
    private SoccerPlayer[] sc;
    private BasketBallPlayer[] bsk;
    private Scanner scanner = new Scanner(System.in);
    private static int playerLength = 16;
    
    Gym() {
        sc = new SoccerPlayer[playerLength];
        bsk = new BasketBallPlayer[playerLength];
    }

    private void reserve(){
        System.out.print("Reserve: Soccer: 1, BasketBall: 2 >> ");
        int state = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Room No.: ");
        int room= scanner.nextInt();
        switch(state){
            case 1:
                if (sc[room] == null)
                    sc[room] = new SoccerPlayer(name,0.0);
                else
                    System.out.println("The room is full.");
                break;
            case 2:
                if (bsk[room] == null)
                    bsk[room] = new BasketBallPlayer(name);
                else
                    System.out.println("The room is full.");
                break;

            default:
                System.out.println("This is a wrong command.");
        }   
    }

    private void search(){
        System.out.print("Search: Soccer: 1, BasketBall: 2 >> ");
        int state = scanner.nextInt();
        System.out.print("Room No.: ");
        int roomNo = scanner.nextInt();
        switch(state){
            case 1:
                if(sc[roomNo] == null)
                    System.out.println("This room is empty.");
                else
                    sc[roomNo].showDetails();
                break;
            case 2:
                if(bsk[roomNo] == null)
                    System.out.println("This room is empty.");
                else
                    bsk[roomNo].showDetails();
                break;
            default:
                System.out.println("This is a wrong command.");
        }
    }

    private void cancel(){
        String name;
        System.out.print("Cancel: Soccer: 1, BasketBall: 2 >> ");
        int state = scanner.nextInt();
        System.out.print("name: ");
        name = scanner.next();
        switch(state){
            case 1:
                for(int i = 0; i < playerLength; i++) {
                    if (sc[i] != null && sc[i].getName().equals(name)) {
                        sc[i] = null;
                        break;
                    }
                    if (i == playerLength - 1)
                        System.out.println("There is no player with that name.");
                }
                break;
            case 2:
                for(int i = 0; i < playerLength; i++) {
                    if (bsk[i] != null && bsk[i].getName().equals(name)) {
                        bsk[i] = null;
                        break;
                    }
                    if (i == playerLength - 1)
                        System.out.println("There is no player with that name.");
                }
                break;
            default:
                System.out.println("This is a wrong command.");
        }
    }

    private void quit(){
        System.out.println("Thank you!");
    }

    public void run(){
        System.out.println("This is a gym reservation system for gym.");
        System.out.println();
        int state = 0;
        while(true){
            System.out.print("Reserve: 1, Search: 2, Cancel: 3, Quit: 4 >> ");
            state = scanner.nextInt();
            switch(state){
                case 1:
                    reserve();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    quit();
                    return;
                default:
                    System.out.println("This is a wrong command.");
            }
            System.out.println();
        }
    }
}
