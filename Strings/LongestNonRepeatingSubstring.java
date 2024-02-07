import java.util.Scanner;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length() - 1; i++) {
            String res = s.charAt(i) + "";
            for (int k = i + 1; k < s.length(); k++) {
                if (s.charAt(i) != s.charAt(k))
                    res += s.charAt(k);
                else
                    break;
            }
            if (noDuplicateValues(res) && res.length() > s1.length())
                s1 = res;
        }
        System.out.println(s1.length());
    }

    public static boolean noDuplicateValues(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (res.indexOf(s.charAt(i)) == -1) {
                res += s.charAt(i);
            } else {
                return false;
            }
        }
        return true;
    }
}
