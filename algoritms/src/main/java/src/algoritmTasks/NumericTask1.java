package src.algoritmTasks;

import java.util.Arrays;

/**
 * Написать код, который выводит числа от 0 до 1000,
 * которые делятся на 3,
 * но не делятся на 5,
 * и сумма цифр в которых меньше десяти.
 */

public class NumericTask1 {
    public static void main(String[] args) {
       for (int i = 0; i <= 100; i++){
           if (i%3==0 && i%5!=0){
               char[] temp = String.valueOf(i).toCharArray();
               int sum = 0;
               for (int j=0; j <=temp.length-1;j++){
                   sum = sum +  Character.digit(temp[j], 10);
               }
               if (sum<10){
                   System.out.println(i);
               }
           }

       }
    }
}
