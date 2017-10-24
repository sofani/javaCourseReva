package object;

public class ObjectTest {
    public static String  print(Object o) {
    	return o.toString();
    }
	public static void main(String[] args) {
		Parent p = new Parent();
		p.setName("Sofani");
		System.out.println(print(p));

	}

}
class Parent {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Hi I'am " + this.name;
	}
}