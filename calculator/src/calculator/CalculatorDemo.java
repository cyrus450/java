package calculator;
import java.util.Scanner;

class Calculator {
    double num1;
    double num2;

    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void calculate(char operator) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero not allowed");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.print("Select (+, -, *, /): ");
            char op = sc.next().charAt(0);

            Calculator calc = new Calculator(a, b);
            calc.calculate(op);
        }
        System.out.println("Program ended");
    }
}