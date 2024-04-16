public class Main {
    public static void main(String[] args) {
        String[] array1 = {"jabłko", "banan", "gruszka", "śliwka", "winogrono"};
        String[] array2 = {"jabłko", "banan", "gruszka", "śliwka", "winogrono"};

        boolean areEqual = compareArrays(array1, array2);

        if (areEqual) {
            System.out.println("Obie tablice są identyczne.");
        } else {
            System.out.println("Tablice nie są identyczne.");
        }
    }

    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
}
