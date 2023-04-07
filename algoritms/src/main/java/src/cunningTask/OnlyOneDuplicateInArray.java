package src.cunningTask;

import java.util.ArrayList;
import java.util.List;

public class OnlyOneDuplicateInArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        for (int i = 1;i<=100;i++){
            list.add(i);
            temp = temp+i;
        }
        list.add(78);

        int sum = 0;
        for (int i =0; i<=list.size()-1;i++){
            sum = sum+list.get(i);
        }
        System.out.println(temp);
        System.out.println(sum);
        System.out.println("Founded duplicate are : "+(sum-temp));

    }
}
