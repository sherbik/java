import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10, 1, 100);

        System.out.println("Tablica wygenerowana losowo:");
        printArray(array);

        int sum = sumOfArray(array);
        double average = (double) sum / array.length;
        System.out.println("\nSuma elementów tablicy: " + sum);
        System.out.println("Średnia elementów tablicy: " + average);
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = generateRandomNumber(min, max);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
