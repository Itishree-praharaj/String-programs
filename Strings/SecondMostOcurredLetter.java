import java.util.Scanner;

public class SecondMostOcurredLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int max = 0;
        int scMax = 0;
        String res = "";
        for (int i = 0; i < c.length; i++) {
            int count = 0;
            char ch = c[i];
            if (ch == '\u0000' || ch == ' ')
                continue;
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] == ch) {
                    count++;
                    c[j] = '\u0000';
                }
            }
            if (count > max) {
                scMax = max;
                res = ch + "";
            }
        }
    }

}
