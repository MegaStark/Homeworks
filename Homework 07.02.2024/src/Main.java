import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        while (true) {
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            int correctAnswer = 0;
            String operation = "";
            int operationType = random.nextInt(4);

            switch (operationType) {
                case 0:
                    correctAnswer = number1 + number2;
                    operation = "+";
                    break;
                case 1:
                    correctAnswer = number1 - number2;
                    operation = "-";
                    break;
                case 2:
                    correctAnswer = number1 * number2;
                    operation = "*";
                    break;
                case 3:
                    if (number2 == 0) number2 = 1;
                    correctAnswer = number1 / number2;
                    operation = "/";
                    break;
            }

            System.out.printf("Сколько будет %d %s %d?" +
                    " (для выхода введите 'exit'): ", number1, operation, number2);
            String userInput = scanner.nextLine();

            if ("exit".equalsIgnoreCase(userInput)) {
                break;
            }

            try {
                int userAnswer = Integer.parseInt(userInput);
                if (userAnswer == correctAnswer) {
                    score += 5;
                    System.out.println("Ваш ответ: " + userAnswer + "" +
                            ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);
                } else {
                    score -= 5;
                    System.out.println("Ваш ответ: " + userAnswer + "" +
                            ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число или 'exit' для выхода.");
            }
        }

        System.out.println("Ура! Опросник завершён! Ваш финальный счёт: " + score);
    }
}
