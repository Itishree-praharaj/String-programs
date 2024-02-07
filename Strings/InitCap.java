import java.util.Scanner;

public class InitCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        char[] s2 = s1.toCharArray();
        for (int i = 0; i < s2.length; i++) {
            if (s2[i] >= 'a' && s2[i] <= 'z') {
                if (i == 0 || s2[i - 1] == ' ') {
                    s2[i] = (char) (s2[i] - 32);
                }
            }
        }
        System.out.println(s2);
    }
}
