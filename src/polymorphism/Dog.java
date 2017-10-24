package polymorphism;

public class Dog extends Animal{
	public boolean hasFour = true;
	public void eat() {
		   super.eat();
		   System.out.println("I eat kibble");
	}
    public void bark() {
	   System.out.println("Woef");
   }
}
