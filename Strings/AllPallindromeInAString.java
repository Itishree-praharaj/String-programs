package Strings;

import java.util.Scanner;

public class AllPallindromeInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        for (int i = 0; i <= s.length() - 2; i++) {
            for (int j = i + 1; j <= s.length() - 1; j++) {
                if (isPallindrome(s, i, j)) {
                    System.out.println(s.substring(i, j + 1));
                }
            }
        }
    }

    static boolean isPallindrome(String s, int start, int end) {
        s = s.toLowerCase();
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
