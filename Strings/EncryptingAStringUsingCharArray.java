import java.util.Scanner;

public class EncryptingAStringUsingCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        char[] s = s1.toCharArray();
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println("Enter the encryption level");
        int level = sc.nextInt();
        for (int i = 0; i < s.length; i++) {
            int index = s[i] - 'a';
            index = index + (level % 26);
            s[i] = alphabets[index % 26];
        }
        System.out.println(s);
    }
}
