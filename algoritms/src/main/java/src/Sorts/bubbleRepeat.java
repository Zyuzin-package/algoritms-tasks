package src.Sorts;

import java.util.Arrays;

public class bubbleRepeat {
    public static void bubbleSort(int[] arr, int temp) {
        for (int i = 0; i <= arr.length - temp - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
        temp++;
        if(temp == arr.length){
            return;
        }
        bubbleSort(arr, temp);
    }

    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10, 7};
        bubbleSort(sortArr, 0);
        System.out.println(Arrays.toString(sortArr));
    }
}
