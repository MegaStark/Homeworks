import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter number2: ");
        double num2 = scanner.nextDouble();

        ArithmeticOperations operations = new ArithmeticOperations(num1, num2);
        System.out.println("Addition: " + operations.addition());
        System.out.println("Subtration:" + operations.subtraction());
        System.out.println("Multiplication:" + operations.multiplication());
        try {
            System.out.println("Division" + operations.division());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sum is" + operations.sumEvenOrOdd());
    }

}