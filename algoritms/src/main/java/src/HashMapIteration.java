package src;

import java.util.*;

public class HashMapIteration {
    public static void main(String[] args) {
        String str = "lorem ipsum adipiscing dolor sit amet lorem consectetur adipiscing lorem elit";

        Map<String,Integer> hashMap= new HashMap<>();

        String[] strings = str.split(" ");
        for (String s : strings){
            if(hashMap.containsKey(s)){
                int temp = hashMap.get(s)+1;
                hashMap.put(s, temp);
            }else {
                hashMap.put(s,1);
            }

        }

        String[] keys = hashMap.keySet().toArray(new String[0]);
        for (String s: keys){
            System.out.println("Key is "+s + " value is "+ hashMap.get(s));
        }
        System.out.println("____________");
        int temp =0;
        while (temp!= keys.length){
            System.out.println("Key is "+keys[temp] + " value is "+ hashMap.get(keys[temp]));
            temp++;
        }
    }
}
