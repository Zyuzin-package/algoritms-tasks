package src;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharAtString {
    public static void main(String[] args) {
        String str = "lorem ipsum adipiscing dolor sit amet lorem consectetur adipiscing lorem elit";
        str = str.replace(" ", "");
        Map<Character, Integer> hashmap = new HashMap<>();
        char[] chars = str.toCharArray();

        for (Character c : chars) {
            if (hashmap.containsKey(c)) {
                hashmap.put(c, hashmap.get(c) + 1);
            } else {
                hashmap.put(c, 1);
            }
        }
        System.out.println(hashmap);

    }
}
