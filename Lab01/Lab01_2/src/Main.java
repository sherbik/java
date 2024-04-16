import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartość x:");
        double x = scanner.nextDouble();

        System.out.println("a(x) = " + functionA(x));
        System.out.println("b(x) = " + functionB(x));
        System.out.println("c(x) = " + functionC(x));
    }

    public static double functionA(double x) {
        if (x > 0) {
            return 2 * x;
        } else if (x < 0) {
            return -3 * x;
        } else {
            return 0;
        }
    }

    public static double functionB(double x) {
        if (x >= 1) {
            return x * x;
        } else {
            return x;
        }
    }

    public static double functionC(double x) {
        if (x > 2) {
            return 2 + x;
        } else if (x < 2) {
            return x - 4;
        } else {
            return 8;
        }
    }
}
