import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        double sumResult = add(num1, num2);
        double diffResult = subtract(num1, num2);
        double multiplyResult = multiply(num1, num2);
        double divideResult = divide(num1, num2);
        double moduloResult = modulo(num1, num2);
        double squareResult = square(num1);

        System.out.println("Сложение: " + sumResult);
        System.out.println("Вычитание: " + diffResult);
        System.out.println("Умножение: " + multiplyResult);
        System.out.println("Деление: " + divideResult);
        System.out.println("Остаток от деления: " + moduloResult);
        System.out.println("Возведение в квадрат: " + squareResult);
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Деление на ноль невозможно");
            return Double.NaN; // Возврат NaN (Not a Number) в случае деления на ноль
        }
    }

    private static double modulo(double a, double b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Деление на ноль невозможно");
            return Double.NaN;
        }
    }

    private static double square(double a) {
        return a * a;
    }
}
