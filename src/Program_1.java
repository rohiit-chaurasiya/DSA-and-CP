import java.util.Scanner;

public class Program_1 {
    private double a;
    private double b;

    public Program_1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = in.nextDouble();
        System.out.print("Enter the second number: ");
        double b = in.nextDouble();
        System.out.print("Enter the Type of Operation-add,subtract,multiply,divide: ");
        String operation = in.next();

        Program_1 calculator = new Program_1(a, b);

        double result;
        switch (operation) {
            case "add":
                result = calculator.add();
                System.out.println("Addition result: " + result);
                break;
            case "subtract":
                result = calculator.subtract();
                System.out.println("Subtraction result: " + result);
                break;
            case "multiply":
                result = calculator.multiply();
                System.out.println("Multiplication result: " + result);
                break;
            case "divide":
                try {
                    result = calculator.divide();
                    System.out.println("Division result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
