//package shape;
 
	 //import java.util.Scanner;

	   //class Areamain {
	   //  public static void main(String[] args) {
//	         Scanner sc = new Scanner(System.in);
//	         square s = new square();
//	         triangle t = new triangle();
//	         circle c = new circle();
//	         System.out.print("Enter side of square: ");
//	         int side = sc.nextInt();
//	         System.out.println("Square area = " + s.area(side));
//	         System.out.print("Enter base of triangle: ");
//	         int base = sc.nextInt();
//	         System.out.print("Enter height of triangle: ");
//	         int height = sc.nextInt();
//	         System.out.println("Triangle area = " + t.area(base, height));
//	         System.out.print("Enter radius of circle: ");
//	         int radius = sc.nextInt();
//	         System.out.println("Circle area = " + c.area(radius));
//	         sc.close();
//	     }
//	 }
package shape;

import java.util.Scanner;

class AreaMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
//            square s = new square();
           triangle t = new triangle();
           circle c = new circle();

            System.out.print("Enter side of square: ");
            double side = sc.nextDouble();
            System.out.println("SQUARE AREA = " + square.area(side));

            System.out.print("Enter base of triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter height of triangle: ");
            double height = sc.nextDouble();
            System.out.println("TRIANGLE AREA = " + t.area(base, height));

            System.out.print("Enter radius of circle: ");
            double radius = sc.nextDouble();
            System.out.println("CIRCLE AREA = " + c.area(radius));
        }
    }
}