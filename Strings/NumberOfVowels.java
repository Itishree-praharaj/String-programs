package Strings;

import java.util.Scanner;

public class NumberOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        s = s.toLowerCase();
        int vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
        }

        System.out.println("Number of vowels = " + vowels);
    }
}
