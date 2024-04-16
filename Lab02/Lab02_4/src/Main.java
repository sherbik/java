import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];

        System.out.println("Podaj pięć słów:");
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.next();
        }

        System.out.println("Słowa od ostatniego do pierwszego, z literami od końca do początku:");
        printWordsInReverseOrder(words);
    }

    public static void printWordsInReverseOrder(String[] words) {
        for (int i = words.length - 1; i >= 0; i--) {
            String reversedWord = reverseString(words[i]);
            System.out.print(reversedWord + " ");
        }
        System.out.println();
    }

    public static String reverseString(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
