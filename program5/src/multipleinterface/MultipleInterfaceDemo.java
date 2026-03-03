package multipleinterface;

import java.util.Scanner;

public class MultipleInterfaceDemo {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();  // consume newline left by nextInt()

            System.out.print("Enter designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter department: ");
            String department = sc.nextLine();
            
            Employee emp = new Employee(name, age, designation, department);

            int choice;
            do {
                System.out.println("\n--- Employee menu ---");
                System.out.println("1. Display Personal");
                System.out.println("2. Display Official");
                System.out.println("3. Display Both");
                System.out.println("4. EXIT");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\nPersonal details:");
                        emp.displayPersonalDetails();
                        break;
                    case 2:
                        System.out.println("\nOfficial details:");
                        emp.displayOfficialDetails();
                        break;
                    case 3:
                        System.out.println("\nPersonal details:");
                        emp.displayPersonalDetails();
                        System.out.println("\nOfficial details:");
                        emp.displayOfficialDetails();
                        break;
                    case 4:
                        System.out.println("Exiting....");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 4);
        }
    }
}