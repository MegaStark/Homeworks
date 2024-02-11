import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели на английском:");
        String dayOfWeek = scanner.nextLine().toLowerCase();

        switch (dayOfWeek) {
            case "monday":
                System.out.println("Сегодня понедельник.");
                break;
            case "tuesday":
                System.out.println("Сегодня вторник.");
                break;
            case "wednesday":
                System.out.println("Сегодня среда.");
                break;
            case "thursday":
                System.out.println("Сегодня четверг.");
                break;
            case "friday":
                System.out.println("Сегодня пятница.");
                break;
            case "saturday":
                System.out.println("Сегодня суббота.");
                break;
            case "sunday":
                System.out.println("Сегодня воскресенье.");
                break;
            default:
                System.out.println("Такого дня недели не существует.");
                break;
        }

        if ("monday".equals(dayOfWeek)) {
            System.out.println("Сегодня понедельник.");
        } else if ("tuesday".equals(dayOfWeek)) {
            System.out.println("Сегодня вторник.");
        } else if ("wednesday".equals(dayOfWeek)) {
            System.out.println("Сегодня среда.");
        } else if ("thursday".equals(dayOfWeek)) {
            System.out.println("Сегодня четверг.");
        } else if ("friday".equals(dayOfWeek)) {
            System.out.println("Сегодня пятница.");
        } else if ("saturday".equals(dayOfWeek)) {
            System.out.println("Сегодня суббота.");
        } else if ("sunday".equals(dayOfWeek)) {
            System.out.println("Сегодня воскресенье.");
        } else {
            System.out.println("Такого дня недели не существует.");
        }
    }
}
