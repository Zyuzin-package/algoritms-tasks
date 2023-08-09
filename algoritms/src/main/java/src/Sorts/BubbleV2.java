package src.Sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleV2 {
    public static void bubbleSort(int[] sortArr, int temp) {
        for (int i = 0; i <= sortArr.length - temp - 1; i++) {
            if (sortArr[i] > sortArr[i + 1] && i + 1 != sortArr.length) {
                int tmp = sortArr[i];
                sortArr[i] = sortArr[i + 1];
                sortArr[i + 1] = tmp;
                temp++;
                bubbleSort(sortArr, temp);
            }
        }
    }

    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10, 7};
        bubbleSort(sortArr,0);
        System.out.println(Arrays.toString(sortArr));
    }
}
