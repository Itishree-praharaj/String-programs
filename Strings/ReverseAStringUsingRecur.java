import java.util.Scanner;

public class ReverseAStringUsingRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println(rev(s, 0, s.length() - 1));
    }

    public static String rev(String s, int start, int end) {
        if (end <= start) {
            return s.charAt(end) + "";
        }
        return s.charAt(end) + "" + rev(s, start, --end);
    }
}
