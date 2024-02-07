import java.util.Scanner;

public class DecryptingUsingCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the encryption level");
        int level = sc.nextInt();
        char[] chrs = s.toCharArray();
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < chrs.length; i++) {
            int index = chrs[i] - 'a';
            index = index - (level % 26);
            if (index < 0) {
                index = 26 + index;
            }
            chrs[i] = alphabets[index];
        }
        System.out.println(chrs);
    }
}
