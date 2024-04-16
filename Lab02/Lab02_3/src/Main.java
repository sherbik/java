public class Main {
    public static void main(String[] args) {
        String[] strings = {"jabłko", "banan", "gruszka", "śliwka", "winogrono"};

        System.out.println("Wartości tablicy z zamienionymi literami na wielkie:");
        printUpperCaseStrings(strings);
    }

    public static void printUpperCaseStrings(String[] array) {
        for (String str : array) {
            System.out.println(str.toUpperCase());
        }
    }
}
