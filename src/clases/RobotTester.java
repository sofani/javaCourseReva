package clases;

public class RobotTester {
	//CLASS
		//In Java, a class is is a structure that can have states and behaviors.
		//.It serves as a template for objects,
		/*A class is nothing but a blueprint or a template for creating different objects 
		      which defines its properties and behaviors.*/
	//OBJECT
		/*Software objects are conceptually similar to real-world objects: they too consist of state and related behavior. 
		 An object stores its state in fields (variables in some programming languages) and
		  exposes its behavior through methods (functions in some programming languages).*/
	public static void main(String[] args) {
		Robot robot = new Robot(2);
		
		robot.travel();
	}

}
