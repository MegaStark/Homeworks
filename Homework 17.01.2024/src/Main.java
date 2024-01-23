import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name eingeben");
        String name = scanner.nextLine();

        System.out.print("Temperatur in Celsius ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;


        System.out.println("Hallo, " + name + "! Temperatur in Fahrenheit ist: " + fahrenheit);




    }
}