package polymorphism;

public class Cat extends Animal {
	public boolean hasFour = true;
	public void eat() {
		   super.eat();
		   System.out.println("I eat meat");
	}
    public void bark() {
  
	   System.out.println("Moe");
	}
}
