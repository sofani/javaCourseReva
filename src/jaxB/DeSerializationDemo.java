package jaxB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		  try {
			  FileInputStream fi = new FileInputStream("/Users/sofani/Documents/workspace/javaRev02/src/jaxB/person.txt");
		      ObjectInputStream oi = new ObjectInputStream(fi);
		      Person person = (Person)oi.readObject();
		     System.out.println(person);
	      } catch (IOException | ClassNotFoundException e) {
	    	  e.printStackTrace();
	      }
	  
	  

	}

}
