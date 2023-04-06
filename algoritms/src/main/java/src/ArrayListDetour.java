package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDetour {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i <=list.size()-1;i++){
            System.out.println(list.get(i));
        }

        System.out.println("_________");

        int temp = 0;
        while (temp<list.size()){
            System.out.println(list.get(temp));
            temp++;
        }
        System.out.println("_________");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("_________");

        for (Integer i : list){
            System.out.println(i);
        }

    }
}
