import java.util.Scanner;

public class StringIsAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String");
        String s2 = sc.nextLine();
        char c[] = s1.toCharArray();
        if (s1.length() != s2.length()) {
            System.out.println("It is not a anagram");
            return;
        }
        // for (int i = 0; i < c.length; i++) {
        // if ((s1.replace(c[i] + "", "").length()) != (s2.replace(c[i] + "",
        // "").length())) {
        // System.out.println("It is not a anagram");
        // return;
        // }
        // }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.replace(s1.charAt(i) + "", "").length() != s2.replace(s1.charAt(i) + "", "").length()) {
                System.out.println("It is not a anagram");
                return;
            }
        }

        System.out.println("It is a anagram");
    }

}