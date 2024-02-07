package Strings;

import java.util.Scanner;

public class PallindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            if (isPalindrome(s1[i]))
                System.out.println(s1[i]);
        }
    }

    static boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;
        while (start < last) {
            if (s.charAt(start) != s.charAt(last))
                return false;
            start++;
            last--;
        }
        return true;
    }
}
