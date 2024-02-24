
import java.util.Random;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите ваше имя: ");
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "! Начнем опросник.");

        for (int i = 0; i < 4; i++) {

                int a = ArithmeticOperation.generateRandomNumber();
                int b = ArithmeticOperation.generateRandomNumber();

        System.out.print("Сколько будет " + a + " + " + b + "? ");
        int userAnswer = scanner.nextInt();

        int correctAnswer = ArithmeticOperation.add(a,b);

        if (userAnswer == correctAnswer) {
        System.out.println("Поздравляю! Вы правильно ответили на вопрос.");
        } else {

        System.out.println("Увы," + userName + ", правильный ответ - " + correctAnswer);

        }

        }

        System.out.println("Поздравляю! Опросник завершён!");
        scanner.close();

    }

}


