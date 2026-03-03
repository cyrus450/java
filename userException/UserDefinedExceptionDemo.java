package userException;
import java.util.Scanner;
public class UserDefinedExceptionDemo{
	
	     static void validateAge(int age) throws InvalidAgeException{
		 if(age<18) {
			 throw new InvalidAgeException("Invalid Age");
		 }else {
			 System.out.println("VALID AGE");			 			 
		 }
	 }
	 
	 
		 static void divide(int Dividend , int Divisor) {
			 if (Divisor == 0) {
			 throw new ArithmeticException("division by zero not allowed");
		 }
			 int result = Dividend/Divisor;
			 System.out.println("Division Result : " + result);	 
	 }
		 
		 
		 
		 public static void main (String[]args) {
		 try (Scanner sc = new Scanner(System.in))		 
		 { 
			 System.out.println("Enter Age : ");
			 int age = sc.nextInt();
			 validateAge(age);	
			 
			 System.out.println("Enter dividend : ");
			 int Dividend = sc.nextInt();
			 System.out.println("Enter divisor : ");
			 int Divisor = sc.nextInt();			 
			 divide(Dividend , Divisor);			 
		 }
		 catch (InvalidAgeException e) {
			 System.out.println("AGE should 18!" + e.getMessage());
		 }
	     catch (ArithmeticException e){				 
			 System.out.println("Predefined Exception Caught : " + e.getMessage());			 
		 }
		 finally {
			 System.out.println("Program Excuted!");
//			 sc.close();
		 }
		 }
		 }