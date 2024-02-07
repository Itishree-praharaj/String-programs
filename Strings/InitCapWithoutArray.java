import java.util.Scanner;

public class InitCapWithoutArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s1 = sc.nextLine();
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if ((s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') || s1.charAt(i) == ' ') {
                if (i == 0 || s1.charAt(i - 1) == ' ') {
                    s2 += (char) (s1.charAt(i) - 32);
                } else {
                    s2 += s1.charAt(i);
                }
            }
        }
        System.out.println(s2);
    }
}
