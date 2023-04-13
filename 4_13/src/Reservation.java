import java.util.Scanner;

public class Reservation {
	private SeatArray[] seatArrays;
	private char[] seatTypes = {'S', 'A', 'B'};
	private Scanner scanner;
	
	public Reservation() {
		this.scanner=new Scanner(System.in);
        this.seatArrays=new SeatArray[3];
        for (int i=0; i<3; i++)
            seatArrays[i] = new SeatArray(seatTypes[i]);
	}
	
	private void reserve() {
		System.out.print("Seat Type S(1), A(2), B(3)>>");
        int seatType = scanner.nextInt();
        if (seatType<1 || seatType>3) {
            System.out.println("Wrong seat type!");
            return;
        }
        this.seatArrays[seatType-1].show();
        System.out.print("Name>>");
        String name = scanner.next();
        System.out.print("Seat Number>>");
        int seatNumber = scanner.nextInt();
        if (seatNumber<1 || seatNumber>16) {
            System.out.println("Wrong seat number!");
            return;
        }
        this.seatArrays[seatType-1].reserve(seatNumber, name);
	}
	
	private void search() {
		for (int i=0; i<3; i++)
            this.seatArrays[i].show();
        System.out.println("This is the end of the search.");
	}
	
	private void cancel() {
		System.out.print("Seat Type S(1), A(2), B(3)>>");
        int seatType = scanner.nextInt();
        if (seatType<1 || seatType>3) {
            System.out.println("Wrong seat type!");
            return;
        }
        this.seatArrays[seatType-1].show();
        System.out.print("Name>>");
        this.seatArrays[seatType-1].cancel(scanner.next());
	}
	
	private void quit() {
        System.out.println("Thank you!");
        System.exit(0);
	}
	
	public void run() {
        while (true)
        {
            System.out.print("Reserve: 1 Search: 2 Cancel: 3 Quit: 4>> ");
            int command = scanner.nextInt();
            if (command==1)
                reserve();
            else if (command==2)
                search();
            else if (command==3)
                cancel();
            else if (command==4)
                quit();
            else
                System.out.println("Wrong command!");
        }
	}
}
