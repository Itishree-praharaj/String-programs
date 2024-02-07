import java.util.Scanner;

public class MissingLettersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        for (char i = 'a'; i <= 'z'; i++) {
            boolean prsnt = false;
            for (int j = 0; j < s.length(); j++) {
                if (i == s.charAt(j))
                    prsnt = true;
            }
            if (!prsnt) {
                System.out.print(i + " ");
            }
        }
    }
}
