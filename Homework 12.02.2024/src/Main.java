import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Сколько игроков будет играть в игру:");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine(); // Пропускаем перевод строки

        String[] playerNames = new String[numberOfPlayers];
        int[] scores = new int[numberOfPlayers];

        // Получаем имена игроков
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Введите имя игрока №" + (i + 1) + ": ");
            playerNames[i] = scanner.nextLine();
        }

        // цикл игры для каждого игрока
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("\nИгрок " + playerNames[i] + ", ваша очередь!");

            for (int j = 0; j < 3; j++) { // Каждому игроку задается 3 вопроса
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
                        if (number2 == 0) number2 = 1; // Исключаем деление на ноль
                        correctAnswer = number1 / number2;
                        operation = "/";
                        break;
                }

                System.out.printf("Вопрос %d: Сколько будет %d %s %d? ", j + 1, number1, operation, number2);
                int userAnswer = scanner.nextInt();
                scanner.nextLine(); // Пропускаем перевод строки

                if (userAnswer == correctAnswer) {
                    scores[i] += 5;
                } else {
                    scores[i] -= 5;
                }
            }
        }

        System.out.println("Игра окончена! Результаты:");
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Игрок " + playerNames[i] + ": " + scores[i] + " баллов");
        }
    }
}
