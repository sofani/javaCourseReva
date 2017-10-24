package stringsAndViriables;

public class VariableExamples {

	public static void main(String[] args) {
		boolean myBoolean = false;
		byte myByte = 16;	// signed 8-bit integer (-128 ... 127)
		short myShort = 3; //
		int 	myInt 	= 32;	// signed 32-bit integer (-2,147,483,648 ... 2,147,483,647)
		float	myFloat	= 32.0f;// signed 32-bit floating point (-3.4028235e38 ... 3.4028235e38)
		double	myDouble = 64.0;// signed 64-bit floating point (-1.7976931348623157e308 ... 1.7976931348623157e308)
		char	myChar	= 'a';	// single 16-bit unicode character ('\u0000' ... '\uffff')
		long 	myLong 	= 64;	// signed 64-bit integer (-9,223,372,036,854,775,808 ... 9,223,372,036,854,775,807)
		
		String myString = new String("This is a string object, created using a constructor");
        System.out.println("2 + 3 " + (myByte + myShort));
        myBoolean = myInt > 6;
	    if (!myBoolean) {
	    	  System.out.println("Sofani");
	    };
		System.out.println("Integer addition: 8 + 16 = " + (myByte + myShort));
		System.out.println("Integer division: 16 / 32 = " + (myShort / myInt));
		System.out.println("    Should be 0.5, but that's not a whole number!");
	
		
	
	    
		
	
		
		
	}

}
