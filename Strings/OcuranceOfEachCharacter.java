import java.util.Scanner;

public class OcuranceOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char ch = c[i];
            int count = 1;
            if (c[i] == ' ')
                continue;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j] && c[i] != '\u0000') {
                    count++;
                    c[j] = '\u0000';
                }
            }
            c[i] = '\u0000';
            if (ch != ' ' && ch != '\u0000') {
                System.out.println(ch + "=" + count);
            }
        }
    }
}
