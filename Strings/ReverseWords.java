import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        // System.out.println(rev(s));
        String c = "";
        for (int i = 0; i < s.length(); i++) {
            String res = "";
            if (s.charAt(i) != ' ') {
                for (; i < s.length(); i++) {
                    if (s.charAt(i) != ' ') {
                        res += s.charAt(i);
                    } else {
                        break;
                    }
                }
                c += rev(res) + " ";
            }
        }
        System.out.println(c.trim());
    }

    public static String rev(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
