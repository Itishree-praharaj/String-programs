package Strings;

import java.util.Scanner;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        char[] s1 = new char[s.length()];
        for (int i = 0; i < s1.length; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                s1[i] = (char) (s.charAt(i) - 32);
            else
                s1[i] = s.charAt(i);
        }
        System.out.println(s1);
    }
}
