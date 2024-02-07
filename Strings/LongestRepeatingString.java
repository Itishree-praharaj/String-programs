import java.util.Scanner;

public class LongestRepeatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        String s2 = s1;
        String res = "";
        for (int i = 0; i < s2.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    res += s1.charAt(i);
                    break;
                }
            }
        }
        if (res.length() == 0) {
            System.out.println("There is not repeating subsequence");
            return;
        }
        System.out.println("The longest repeating subsequence is " + res);
    }
}
