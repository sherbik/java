import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj czy pada deszcz (true - jeżeli tak, false - jeżeli nie):");
        boolean isRaining = scanner.nextBoolean();

        System.out.println("Podaj czy jest autobus na przystanku (true - jeżeli tak, false - jeżeli nie):");
        boolean isBusAtStop = scanner.nextBoolean();

        checkWeatherAndBus(isRaining, isBusAtStop);
    }

    public static void checkWeatherAndBus(boolean isRaining, boolean isBusAtStop) {
        if (isRaining && isBusAtStop) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnię");
        } else if (isRaining && !isBusAtStop) {
            System.out.println("Nie dostaniesz się na uczelnię");
        } else if (!isRaining && isBusAtStop) {
            System.out.println("Dostaniesz się na uczelnię");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }
}
