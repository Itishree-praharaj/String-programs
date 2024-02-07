package Strings;

import java.util.Scanner;

public class NumberOfPunctuationMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int chr = s.charAt(i);
            if ((chr >= 33 && chr <= 47) || (chr >= 58 && chr <= 64) || (chr >= 91 && chr <= 96)
                    || (chr >= 123 && chr <= 126))
                count++;
        }
        System.out.println("The number of punctuation marks present in " + s + " is -> " + count);
    }
}
