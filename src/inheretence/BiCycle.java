package inheretence;
//inheritance is one of basic OOP features which gives access behaviors(methods) and states(variables) of one class to another class.
//a Class in java can extend only one another class
//multiple inheritance in java is when a class inherits two items with the same signature from two different sources.
//creates is-a relation ship b/n a parent class and child class.
//This relationship is only one way all magazines are books but all books are not magazines.
//the gateway to polymorphism(an  object is considered an instance of every class in its inheritance of a class)
//Method overloading when a child class inherits public and protected items from parent class
//A child class also can declare its own method with the same name and parameters, "Hiding" the inherited implementation behind its own
//super keyword always a reference to the current object's parent class
public class BiCycle {
    public  int cadence;
    public int gear;
    public int speed;
    public BiCycle(int startcadence, int startgear, int startspeed) {
    	cadence = startcadence;
    	gear = startgear;
    	speed = startspeed;
    }
    public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
    public void applyBrake(int decrement) {
    	speed -= decrement;
    	System.out.println("speed " + speed);
    }
    public void speedUp(int increment) {
    	speed += increment;
    	
    }
	public void speak() {
    	System.out.println("Generic animals noise");
    }
	
	//Demo for polymorphism(an object can have  many different forms( behaviors).
	/* subclasses of a class can define their own unique behaviors and 
	  yet share some of the same functionality of the parent class*/
	
    public void printDescription() {
    	System.out.println("\n Bike is " + " in gear " + this.gear
    			                         + "with a cadence of " + this.cadence
    			                         + " and traveling at a speed of " + this.speed + " ."
    			);
    }
    
}
