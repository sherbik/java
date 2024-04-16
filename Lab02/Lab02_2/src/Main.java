public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {11, 12, 13, 14, 15, 16, 17};

        System.out.println("Co drugi element z tablicy parzystej:");
        printEverySecondElement(array1);

        System.out.println("\nCo drugi element z tablicy nieparzystej:");
        printEverySecondElement(array2);
    }

    public static void printEverySecondElement(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
