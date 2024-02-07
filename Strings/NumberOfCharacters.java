package Strings;

import java.util.Scanner;

public class NumberOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                count++;
        }
        System.out.println("The number of characters present in the String is -> " + count);
    }
}
