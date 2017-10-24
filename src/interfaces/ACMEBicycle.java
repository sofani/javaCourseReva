package interfaces;

public class  ACMEBicycle implements Bicycle {
     int candence = 0;
     int gear = 1;
     int speed = 1;
     
	@Override
	public void changeCadence(int newValue) {
		
		candence = newValue;
	}

	@Override
	public void changeGear(int newValue) {
		gear = newValue;
		
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
		
	}

	@Override
	public void applyBrakes(int decrement) {
		speed -= decrement;
		
	}
	public void print() {
		System.out.println("cadence " + candence + " gear " + gear + " speed " + speed) ;
	}

}
