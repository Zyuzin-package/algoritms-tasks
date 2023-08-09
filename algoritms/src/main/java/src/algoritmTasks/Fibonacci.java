package src.algoritmTasks;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 0; i <=99; i++){
            int temp = list.get(list.size()-1)+list.get(list.size()-2);
            list.add(temp);
        }
        System.out.println(list);
    }
}
