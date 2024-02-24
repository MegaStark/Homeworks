
import java.util.Random;

public class ArithmeticOperation {
    public static Random random = new Random();

    public static int generateRandomNumber() {
        return random.nextInt(10) + 1; // Генерация случайного числа от 1 до 10
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Ошибка");
            return Double.NaN;
        }

        }
    }