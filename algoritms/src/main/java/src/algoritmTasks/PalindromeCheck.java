package src.algoritmTasks;

import java.util.Arrays;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str1 = "korka";
        String str2 = "kokrkok";

        char[] chars = str1.toCharArray();
        int temp = 0;
        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length) {
                break;
            }
            if (chars[i] == chars[chars.length - 1 - i]) {
                temp++;
            }
        }
        if (temp == chars.length) {
            System.out.println(Arrays.toString(chars) + " is palindrome");
        } else {
            System.out.println(Arrays.toString(chars) + " is not palindrome");
        }
    }
}
