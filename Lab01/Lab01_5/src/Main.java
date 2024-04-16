import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj czy jest zniżka na samochód (true - jeżeli tak, false jeżeli nie):");
        boolean hasCarDiscount = scanner.nextBoolean();

        System.out.println("Podaj czy otrzymałeś podwyżkę (true - jeżeli tak, false jeżeli nie):");
        boolean receivedBonus = scanner.nextBoolean();

        checkCarPurchase(hasCarDiscount, receivedBonus);
    }

    public static void checkCarPurchase(boolean hasCarDiscount, boolean receivedBonus) {
        if ((!hasCarDiscount || receivedBonus) && !(hasCarDiscount && receivedBonus)) {
            System.out.println("Możesz kupić samochód !");
            System.out.println("Zniżki na samochód nie ma");
        } else if (!hasCarDiscount || !receivedBonus) {
            System.out.println("Zakup samochód trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        } else {
            System.out.println("Możesz kupić samochód !");
        }
    }
}
