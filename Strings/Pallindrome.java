package Strings;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        if (isPallindrome(s))
            System.out.println("It is a pallindrome");
        else
            System.out.println("It is not a pallindrome");
    }

    public static boolean isPallindrome(String s) {
        int start = 0, end = s.length() - 1;
        s = s.toLowerCase();
        for (; start < end;) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
