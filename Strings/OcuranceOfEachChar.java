import java.util.Scanner;

public class OcuranceOfEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        String s2 = s1;
        String res = "";
        int min = s1.length();
        int max = 0;
        char maxchar = ' ';
        char minchar = ' ';
        int len = 0;
        for (char c = 'a'; c <= 'z' && len < s1.length(); c++) {
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (c == s1.charAt(i)) {
                    count++;
                    len++;
                }
            }
            if (count > 0) {
                res += (count + "" + c);
                if (count > max) {
                    max = count;
                    maxchar = c;
                }
                if (count < min) {
                    min = count;
                    minchar = c;
                }
            }
        }
        System.out.println("The maximum occurance character is " + maxchar + " " + max + "time");
        System.out.println("The minimum occurance character is " + minchar + " " + min + "time");
        System.out.println(res);
    }
}
