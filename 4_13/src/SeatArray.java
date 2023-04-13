public class SeatArray {
	private char seatType;
	private Seat[] seats;
	private static int seatLength = 16;
	
	public SeatArray(char seatType) {
        this.seatType = seatType;
        this.seats = new Seat[seatLength];
        for (int i=0; i<seatLength; i++)
            seats[i] = new Seat();
	}
	
	public void reserve(int seatNumber, String name) {
        if (name.equals("---"))
            System.out.println("Wrong name!");
        else if (!this.seats[seatNumber-1].isMatched("---"))
            System.out.println("Already reserved!");
        else
		    this.seats[seatNumber-1].setName(name);
	}
	
	public void show() {
		System.out.print(this.seatType + " >> ");
        for (int i=0; i<seatLength; i++)
            this.seats[i].show();
        System.out.println();
	}
	
	public void cancel(String name) {
        boolean found = false;
		for (int i=0; i<seatLength; i++)
            if (this.seats[i].isMatched(name))
            {
                this.seats[i].cancel();
                found = true;
                break;
            }
        if (!found)
            System.out.println("No reservation " + name);
	}
}