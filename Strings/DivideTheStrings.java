package Strings;

import java.util.Scanner;

public class DivideTheStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        System.out.println("Enter the number of parts ");
        int NumberOfParts = sc.nextInt();
        if (s1.length() % NumberOfParts != 0) {
            System.out.println("String cannot be divided");
            return;
        }
        String result[] = new String[NumberOfParts];
        int len = s1.length() / NumberOfParts;
        int temp = 0;
        for (int i = 0; i < s1.length(); i += len) {
            result[temp] = s1.substring(i, i + len);
            temp++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
