package src.Sorts;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{60, 15, 69, 8, 25, 60, 86, 91, 12, 71};
        System.out.println("\n");
        for (int i = arr.length - 1; i > 0; i--) {
            sort(arr, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp;
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }
}
