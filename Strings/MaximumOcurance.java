import java.util.Scanner;

public class MaximumOcurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.next();
        String s2 = s1;
        char c = ' ';
        int max = 0;
        while (s1.length() > 0) {
            s2 = s2.replace(s1.charAt(0) + "", "");
            int len = s1.length() - s2.length();
            if (len > max) {
                max = len;
                c = s1.charAt(0);
            }
            s1 = s2;
        }
        System.out.println("Max = " + c + " = " + max);
    }
}
