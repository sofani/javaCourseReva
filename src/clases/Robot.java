package clases;

public class Robot {
   private int maxSpeed;
   Robot() {
	   this.maxSpeed = 1;
   }
   Robot(int x) {
	   this.maxSpeed = x;  
   }
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed >= 0) {
		  this.maxSpeed = maxSpeed;
		} else {
			this.maxSpeed = 0;
		}
	}
    public void travel() {
    	System.out.println("The robot moves a distance of " + maxSpeed + " units ");
    }
}
