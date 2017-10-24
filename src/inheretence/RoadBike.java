package inheretence;

public class RoadBike extends BiCycle {
    private int tirewidth;
	public RoadBike(int startcadence, int startgear, int startspeed, int newTireWidth) {
		super(startcadence, startgear, startspeed);
		this.setTirewidth(newTireWidth);
		
	}
	public int getTirewidth() {
		return tirewidth;
	}
	public void setTirewidth(int tirewidth) {
		this.tirewidth = tirewidth;
	}
	public void printDescription() {
		super.printDescription();
		System.out.println("The Road Bike has " + getTirewidth() + "MM tires");
	}

}
