import java.util.Scanner;

public class SwapTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.next();
        System.out.println("Enter the second string");
        String s2 = sc.next();
        int lenS2 = s2.length();
        s2 += s1;
        s1 = s2.substring(0, lenS2);
        s2 = s2.replace(s1 + "", "");
        System.out.println(s1);
        System.out.println(s2);
    }
}
