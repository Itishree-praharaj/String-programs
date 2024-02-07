
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        s = s.toLowerCase();
        if (s.length() < 26) {
            System.out.println("It is not a panagram");
            return;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            boolean letterpresent = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    letterpresent = true;
                    break;
                }
            }
            if (!letterpresent) {
                System.out.println("Not a pangram");
                return;
            }
        }
        System.out.println("it is a panagram");
    }
}
