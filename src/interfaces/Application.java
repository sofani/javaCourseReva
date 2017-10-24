package interfaces;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
	     Animal a = new Dog();
		 Domesticated d = new Dog();
		 Domesticated.register(d);
		 d.dowork("teacher");
		
		
		
	}

}
 interface  Domesticated {
	 ArrayList<String> animals = new ArrayList<>();
	 ArrayList<String> plants = new ArrayList<>();
	 
	 static void register(Domesticated species) {
		 if (species instanceof Animal) {
			 animals.add(species.getClass().getName());
			 System.out.println(animals.get(0));
		 } else if (species instanceof Plant) {
			 plants.add(species.getClass().getName());
			 System.out.println(plants.get(0));
		 }
		 
	 }
	 void dowork();
	 default void dowork(String job) {
		 System.out.println("I love " + job);
	 }
}
abstract class Animal {
	void eat() {
		System.out.println("meat + vegi");
	}
}
abstract class Plant {
	void eat() {
		System.out.println("vegi");
	}
}
//class Cat extends Animal {
//	void eat() {
//		System.out.println("eats only  vegi");
//	}
//}
class Dog extends Animal implements Domesticated {

	@Override
	public void dowork() {
		System.out.println("hunts for food");
		
	}
	public void eat() {
		System.out.println("Eating only meat");
	}
	
}
class Wheat extends Plant implements Domesticated {

	@Override
	public void dowork() {
		System.out.println("I produce large quantities of grain");
		
	}
	void eat() {
		System.out.println("vegi + Vegi");
	}
	
}
