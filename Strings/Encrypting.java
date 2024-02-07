import java.util.Scanner;

public class Encrypting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the encryption level");
        int level = sc.nextInt();
        String encrypted = "";
        // System.out.println(s.charAt(0) + level);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                encrypted += ' ';
                continue;
            }
            int res = s.charAt(i) + level;
            if (res > 122) {
                res -= 122;
                while (res >= 26) {
                    res -= 26;
                }
                encrypted += (char) ((96 + res));
            } else {
                encrypted += (char) (s.charAt(i) + level);
            }
        }
        System.out.println("The encrypted String is " + encrypted);
    }
}
