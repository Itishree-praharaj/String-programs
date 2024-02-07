import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                String c = "";
                for (; i >= 0; i--) {
                    if (s.charAt(i) != ' ')
                        c += s.charAt(i);
                    else
                        break;
                }
                res += rev(c);
                res += " ";
            }
        }
        System.out.println(res);
    }

    public static String rev(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
