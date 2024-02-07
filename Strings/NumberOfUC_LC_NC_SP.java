package Strings;

import java.util.Scanner;

public class NumberOfUC_LC_NC_SP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int uc = 0;
        int lc = 0;
        int nc = 0;
        int sp = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                uc++;
            else if (c >= 'a' && c <= 'z')
                lc++;
            else if (c >= '0' && c <= '9')
                nc++;
            else
                sp++;
        }

        System.out.println("Number of UpperCase letters are " + uc);
        System.out.println("Number of LowerCase letters are " + lc);
        System.out.println("Number of NUmberCharacter letters are " + nc);
        System.out.println("Number of Special Characters are " + sp);
    }
}
