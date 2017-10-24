package inheretence;

public class InheretenceExample {
    public static void makeItTalk(BiCycle input) {
    	if (input instanceof MountainBike) {
    	   input.speak();
    	} else {
    		System.out.println("I dont Know what is it?");
    	}
    	
    }
	public static void main(String[] args) {
		//BiCycle bike = new BiCycle(1, 2, 3);
		//MountainBike mb = new MountainBike(4, 5, 8, 2, "a");
//		System.out.println("make animal talk");
//		makeItTalk(bike);
//		System.out.println("make dog talk");
//		makeItTalk(mb);
		
		
//		BiCycle bike1, bike2, bike3;
//		bike1 = new BiCycle(20, 10, 1);
//		bike2 = new MountainBike(20, 10, 5, 100, " Dual");
//		bike3 = new RoadBike(40, 20, 8, 23);
//		bike1.printDescription();
//		bike2.printDescription();
//		bike3.printDescription();

	}

}
