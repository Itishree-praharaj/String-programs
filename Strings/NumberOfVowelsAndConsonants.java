package Strings;

import java.util.Scanner;

public class NumberOfVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int vowelcount = 0;
        int consonantcount = 0;
        String ns = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (ns.charAt(i) == 'a' || ns.charAt(i) == 'e' || ns.charAt(i) == 'i' || ns.charAt(i) == 'o'
                    || ns.charAt(i) == 'u')
                vowelcount++;
            else
                consonantcount++;
        }

        System.out.println("Number of vowels present in the string is " + vowelcount);
        System.out.println("Number of consonants present in the string is " + consonantcount);
    }
}
