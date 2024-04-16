import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartość x:");
        double x = scanner.nextDouble();

        System.out.println("Podaj wartość y:");
        double y = scanner.nextDouble();

        System.out.println("Podaj wartość z:");
        double z = scanner.nextDouble();

        sortNumbers(x, y, z);
    }

    public static void sortNumbers(double x, double y, double z) {
        double temp;

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        System.out.println("Liczby posortowane rosnąco: " + x + ", " + y + ", " + z);
    }
}
