package src;

import java.util.Arrays;

public class StringRevers {
    public static void main(String[] args) {
        String str = "lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        char[] chars = str.toCharArray();
        char[] resultChars = new char[chars.length];
        int temp = 0;
        for (int i =  chars.length-1; i >=0; i--) {
            resultChars[temp] = chars[i];
            temp++;
        }
        System.out.println(resultChars);
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
