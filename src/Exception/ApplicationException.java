package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

public class ApplicationException {
     /* Exception is a problem that occurs during compilation and execution of a program.
      * Exception are thrown and can be caught and handled independently
      * Exceptions comes in java in two forms(checked and  unchecked)
      *     checked
      *        ->detected during compilation , 
      *       -> means that the compiler will look for and catch the error, 
      *           and you will not be able to run your application until it’s fixed.)  
      *    unchecked
      *      -> occur during run time
      *       ->will slip through and crop up in the middle of execution potentially killing application 
      *          in middle of execution.
      *          
      * Inheritance tree for the Exception class(The Top Tree is), Throwable class
      *       ->Throwable class has two subClasses ==> (Error and Exception)
      *       ->Errors has nothing to do with java program (JVM running out of memory) ==>is unchecked Exception     
      *       ->Exception(IOException(checked Exception), classNotFoundException(checked Exception), RunTimeException(Unchecked) 
      *         -> Exception is associated with being unable to locate or connect to a resource such as a file, a database, another server)
      *      -->RunTimeException(Arithmetic Exception, ClassCast Exception, IndexOutOfBoundException) ==> Unchecked Exception
      *         -> The RuntimeException class represents the dividing line between checked and unchecked exceptions.
      *         It too has over a hundred direct subclasses for which only three of the more common ones are shown.
      *         Runtime exceptions are associated with logic problems in your code such as 
      *         accessing a non-existent array element or division by zero or 
      *         casting to something outside the inheritance tree
      *         
      *         
      *        ==> Exceptions are handled in Java with a try/catch/finally block 
      *        ==>The try block contains code or method invocations which can throw exceptions
      *        ==>The catch block grabs the thrown exception and executes the enclosed code.
      *            You can have multiple catch blocks to handle different types of exceptions differently.
      *        ==>The finally block executes regardless of the outcome, even if there is a return statement in the try block(clean up purpose)
      *        
      *        Note: that unchecked or runtime exceptions can also be caught if desired.
      *        multiple exceptions 
      *        -->multiple catch blocks are evaluated top to bottom
      *        
      *        When catching multiple exceptions in Java, each catch statement will be evaluated in order
      *         to determine if it applies to the exception being thrown, and 
      *         only the first applicable one will actually catch the exception.
      *         This can cause unexpected results, if we catch an exception earlier than expected. 
      *         Remember the inheritance tree for exceptions?Well, 
      *         the principle of polymorphism means that every ArithmeticException is also a RuntimeException, 
      *         which is also an Exception.Consider what happens if we catch a generic Exception before catching 
      *         the ArithmeticException.Now not only will the print statement in the second catch block NOT execute 
      *         for ArithmeticExceptions, it won’t execute for any exceptions!
      *         This is because any exception will always be caught by the catch block that handles 
      *         the more generic Exception first.
      *          ====> The Throws clause
      *           -> a method declaration can have a throws clause, indicating that it may throw and will not handle certain exception
      *           -> a method with throws clause is a source for checked exception
      *         In Java a method does not need to handle an exception at all!Instead, 
      *         
      *         you can simply re-throw it to the calling code thereby getting rid of the problem.This re-throwing can 
      *         continue all the way back to the main method where throwing 
      *         the exception to the JVM may in fact crash the program.
      *         You should always be careful to properly 
      *         handle exceptions somewhere, if not where they immediately occur.Here we have created a program to 
      *         demonstrate the policy regarding checked exceptions.
      *         The main method calls a static method openFile.
      *         The FileInputStream class has a constructor that accepts a filename.If the file is not found, 
      *         the constructor throws a FileNotFoundException.Since we have made the OpenFile method throw the 
      *         exception back to the calling code with the “throws” clause, the compiler is now happy with the 
      *         openFile method.However, we now need to catch the exception in our main method.Exceptions are 
      *         an elegant way to handle crashes, but there may be situations where handling an exception is 
      *         actually less 
      *         preferable than letting an application crash.This is typically the case when performance is
      *         so important that you can’t waste processing time on handling exceptions, or when your 
      *         application is communicating remotely with another application, and you need to keep the 
      *         information exchanged between the two synchronized.For most applications though, this isn’t 
      *         the case, and handling exceptions can offer a lot of protection.
      *         ==> If the superclass method does not declare an exception, subclass overridden 
      *          method cannot declare the checked exception but it can declare unchecked exception.
      *         ==> If the superclass method declares an exception, subclass overridden method can declare same, 
      *          subclass exception or  no exception but cannot declare parent exception.
      *          
      *         ==> If you are creating your own Exception that is known as custom exception
      *        ==>  throws keyword is used to declare an exception. 
      * */ 
	public static  void openFile() throws FileNotFoundException {
		   FileInputStream fileInputStream = new FileInputStream("/Users/sofani/Documents/workspace/Java_Assignment_7_Interfaces/assignment7");
	}
	
	
	
	public static void main(String[] args)  {
		
		//int[] a = new int[0];
		//System.out.println(a[1/0]);
//		try {
//		  openFile();
//		} catch(FileNotFoundException e) {
//			System.out.println("File not found");
//		} catch (Exception f) {
//			System.out.println("File found");
//		}
//		try {
//			int x = 5;
//		
//			System.out.println(x /0);
//		
//		
//			
////		}catch(Exception e) {
////			System.out.println("exception");
////		} 
//		}catch (ArithmeticException e) {
//			System.out.println("arthimetic exception");
//			e.printStackTrace();
//			
//		} 
//		finally {
//			System.out.println("executes regardless of the outcome");
//		}
//		System.out.println("The code continue as normal");
//	}
		
		
		
	}
}
class Parent{  
	  void msg(){
		  System.out.println("parent");
	 }  
}  
class TestExceptionChild1 extends Parent {  
//	  void msg()throws IOException {  //IOException exception is Compile Exception(checked Exception)
//	    System.out.println("TestExceptionChild");  
//	  }
}  
	  
class TestExceptionChild extends Parent {  
	  void msg()throws ArithmeticException {  //Arthimetic exception is runtime Exception(Unchecked Exception)
	    System.out.println("TestExceptionChild");  
	  }
}  
