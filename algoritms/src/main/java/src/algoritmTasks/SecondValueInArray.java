package src.algoritmTasks;

import java.util.Arrays;

public class SecondValueInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 2, 6,3};

        int biggest= arr[0];
        int secondBiggest = arr[0];

        for (Integer i : arr) {
            if(i>biggest){
                secondBiggest=biggest;
                biggest = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(biggest);
        System.out.println(secondBiggest);
    }
}