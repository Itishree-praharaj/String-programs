import java.util.Scanner;

public class ReplaceAllWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the char to replace");
        String c = sc.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res += c.charAt(0);
            } else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
