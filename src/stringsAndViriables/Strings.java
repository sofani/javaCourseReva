package stringsAndViriables;

public class Strings {
	
	/*The String class is special in Java for several reasons:For one, 
	//it can be instantiated in two different ways unlike all other classes.
	//But most importantly, string objects are often recycled by the JVM instead of 
	    //creating new ones every time.This is called the string pool
	//.This is important, because the String class is immutable in Java,which means String objects cannot be changed
	//once they are created.*/
     
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("sofani");
		String s  = new String("sofani");
		String s1  = new String("sofani");
		String s2  = new String("sofani mesfun");
		String s3  = new String("sofani mesfun");
		if (s2 == s3) {
			System.out.println("sofani mesfun");
		} else if (s2.equals(s3)) {
			System.out.println("sofani");
			
		}
		

	}

}
