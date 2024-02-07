import java.util.Scanner;

public class ReverseWordsPresentInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        String s2[] = s1.split(" ");
        String res = "";
        for (int i = 0; i < s2.length; i++) {
            res += rev(s2[i]) + " ";
        }
        System.out.println(res.trim());
    }

    static String rev(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
