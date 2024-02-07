import java.util.Scanner;

public class OcuranceOfEachCharUsingReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s1 = sc.nextLine();
        String s2 = s1;
        String res = "";
        int max = 0;
        int min = s1.length();
        char maxc = ' ';
        char minc = ' ';
        while (s1.length() > 0) {
            char ch = s1.charAt(0);
            s2 = s2.replace(ch + "", "");
            int len = s1.length() - s2.length();
            if (len > max) {
                max = len;
                maxc = ch;
            }
            if (len < min) {
                min = len;
                minc = ch;
            }
            res += len + "" + ch;
            s1 = s2;
        }
        System.out.println("max = " + maxc + " = " + max);
        System.out.println("min = " + minc + " = " + min);
        System.out.println(res);
    }
}
