import java.util.Scanner;

public class MinimumOcurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.next();
        String s2 = s1;
        int min = s1.length();
        char minc = ' ';
        while (s1.length() > 0) {
            s2 = s2.replace(s1.charAt(0) + "", "");
            int len = s1.length() - s2.length();
            if (len < min) {
                min = len;
                minc = s1.charAt(0);
            }
            s1 = s2;
        }
        System.out.println("Min = " + minc + " = " + min);
    }
}
