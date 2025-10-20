import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] zahlen = {4, 8, 3, 10, 17};

        System.out.println("Array: " + Arrays.toString(zahlen));

        // aufgabe 1
        System.out.println("Aufgabe 1 - Maximale Zahl: " + ArrayRechner.findMax(zahlen));

        // aufgabe 2
        System.out.println("Aufgabe 2 - Minimale Zahl: " + ArrayRechner.findMin(zahlen));
    }
}