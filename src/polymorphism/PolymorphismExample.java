package polymorphism;

public class PolymorphismExample {
     /*
      * many forms(Polymorphism means to process objects differently based on their data type.)
      * Objects are stored in heap memory and their addreses are stored in reference variable
      * reference variable use a class as a type 
      * conditions
      * object Type must have is-a relationship with reference variable type
      * the reference type can not be more specific than the object type
      * */
	public static void main(String[] args) {
		Animal myAni = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
	
        Dog dog = (Dog) myAni;
        Cat cat = (Cat) myAni;
		dog.eat();
		cat.eat();
		//myDog.bark();
        System.out.println(myDog.hasFour);
	}

}
