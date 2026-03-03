package printerdemo;

import java.util.Scanner;
public class Printermain{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		printer P;
		int choice;
		do {
			System.out.println("----.Printer menu----");
			System.out.println("1.Dotmatrix printer");
			System.out.println("2.Laserjet printer");
			System.out.println("3.EXIT");
			System.out.println("Enter choice");
         choice = sc.nextInt();
         switch(choice){
        	 case 1 : 
        		 P = new DotMatrix();
        		 P.configuration();
        		 P.display();
        		 break;
        	 case 2 : 
        		 P = new LaserJet();
        		 P.configuration();
        		 P.display();
        		 break;	 
        	 case 3 :
        		 System.out.println("EXITing...");
        		 break;
        	default:
        	     System.out.println("invalid");
                 }
		}while (choice !=3);

	}
	}}

				
			