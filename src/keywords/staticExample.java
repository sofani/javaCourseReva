package keywords;

public class staticExample {
   /*keywords are reserved words in Java that give the compiler specific instructions,
    and so cannot be used to name fields, methods, or classes.*/
	// static, final, and abstract,
	//STATIC
			/*
			 * Static members are globally available to all instances of a class
			 * a static method can only use other static members within the same class
			 * */
	//FINAL
	  /*
	   * Declares something final it can not be changed
	   * primitive variables can not modify values
	   * reference variables can not switch statements
	   * methods can not be overridden
	   * classes can not be extended
	   * */
	//ABSTRACT
	
	/*
	 *incomplete entity in java
	 *missing definition(contains no body)
	 *abstract class can not be instantiated only can be extended
	 *If a class contains any abstract methods then it becomes an abstract class and must be declared as such, 
	    or your application simply wont compile
	  *it contains non abstract method(concrete)
	  *if a child class extends an abstract class, it must override all 
	      inherited abstract methods to provide an implementation of its own 
	    (if do not do this the subclass must also be declared abstract it is not complete yet)
	
	 * */
	public static void main(String[] args) {
		StaticDemo sd  = new StaticDemo();
		System.out.println("counter  " + sd.counter);
		System.out.println("number  " + sd.number);
		StaticDemo sd2  = new StaticDemo();
		System.out.println("counter  " + sd2.counter);
		System.out.println("number  " + sd2.number);
		
		Dog myDog = new Dog();
		myDog.eat();
		myDog.move();
		myDog.beg();
		
	}

}
class StaticDemo {
	   static int counter = 0;
	   int number = 0;
	   public  StaticDemo() {
		   counter++;
		   number++;
	   }
}
  abstract class Animal {
	  public void eat() {
		  System.out.println("The animal matches on some food");
	  }
	  abstract void move();
	  
  }
  class Dog extends Animal {

	@Override
	void move() {
		 System.out.println("The dog  walks around");
		
	}
    public void beg() {
    	System.out.println("The dog looks cute to get food");
    }
	
	
	  
  }
  
  