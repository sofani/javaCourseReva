package inheretence;

public class MountainBike extends BiCycle {
	int seatHeight;
	String suspention;
	public MountainBike(int startcadence, int startgear, int startspeed, int startHeight, String  suspentionType) {
		super(startcadence, startgear,startspeed );
		this.seatHeight = startHeight;
		this.setSuspention(suspentionType);
	}
	
	 public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public void speak() {
	    	System.out.println("woof");
	    	super.applyBrake(2);
	 }
	
	public String getSuspention() {
		return suspention;
	}

	public void setSuspention(String suspention) {
		this.suspention = suspention;
	}

	public void printDescription() {
		super.printDescription();
		System.out.println("\n The MountainBike has  " +  getSuspention() + " suspension.");

	}

}
     