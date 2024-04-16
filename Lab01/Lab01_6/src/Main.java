import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz działanie:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Reszta z dzielenia");

        int choice = scanner.nextInt();

        System.out.println("Podaj dwie liczby:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Wynik dodawania: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Wynik odejmowania: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Wynik mnożenia: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Wynik dzielenia: " + (num1 / num2));
                } else {
                    System.out.println("Nie można dzielić przez zero.");
                }
                break;
            case 5:
                System.out.println("Reszta z dzielenia: " + (num1 % num2));
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }
    }
}
