import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод предложения от пользователя
        System.out.println("Введите предложение:");
        String inputSentence = scanner.nextLine();

        // Вывод предложения
        System.out.println("Вы ввели следующее предложение:");


        scanner.close();
    }
}
