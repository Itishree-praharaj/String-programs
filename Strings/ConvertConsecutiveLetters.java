import java.util.Scanner;

public class ConvertConsecutiveLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.next();
        char c[] = s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char ch = s1.charAt(i);
            for (int j = i + 1; j < c.length; j++) {
                if (ch == c[j]) {
                    c[i] = '$';
                    c[j] = '$';
                } else {
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
