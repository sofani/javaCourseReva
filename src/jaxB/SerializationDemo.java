package jaxB;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("sofani");
		person.setLastName("mesfun");
		person.setEmail("sofanib@gmail.com");
		person.setSsn("601-601-601");
		try {
			FileOutputStream out = new FileOutputStream("/Users/sofani/Documents/workspace/javaRev02/src/jaxB/person.txt");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(person);
		}  catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
