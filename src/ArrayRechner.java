public class ArrayRechner {

    // Finden Sie die maximale Zahl.
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Das Array darf nicht null oder leer sein.");

        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    // Finden Sie die minimale Zahl.
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Das Array darf nicht null oder leer sein.");

        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    // Finden Sie die maximale Summe von n-1 Zahlen.

    // Finden Sie die minimale Summe von n-1 Zahlen.
}
