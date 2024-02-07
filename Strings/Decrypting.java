import java.util.Scanner;

public class Decrypting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.next();
        System.out.println("Enter the level of encryption");
        int level = sc.nextInt();
        String res = "";
        for (int i = 0; i < s1.length(); i++) {
            int decrypt = s1.charAt(i) - level;
            if (decrypt <= 96) {
                decrypt += 26;
                while (decrypt <= 96) {
                    decrypt += 26;
                }
                res += (char) (decrypt);
            } else {
                res += (char) (s1.charAt(i) - level);
            }
        }

        System.out.println(res);
    }
}
