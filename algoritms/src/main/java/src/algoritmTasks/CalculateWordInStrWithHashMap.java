package src.algoritmTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CalculateWordInStrWithHashMap {
    public static void main(String[] args) {
        String str = "lorem ipsum adipiscing dolor sit amet lorem consectetur adipiscing lorem elit.";

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
        System.out.println(hashMap);

    }
}
