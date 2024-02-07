import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        String s2 = s;
        while (s.length() > 0) {
            s2 = s2.replace(s.charAt(0) + "", "");
            int dif = s.length() - s2.length();
            if (dif > 1) {
                System.out.println(s.charAt(0));
            }
            s = s2;
        }
    }
}
