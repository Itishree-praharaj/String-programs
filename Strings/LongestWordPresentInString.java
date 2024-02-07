import java.util.Scanner;

public class LongestWordPresentInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int len = 0;
        char c[] = s.toCharArray();
        s = "";
        for (int i = 0; i < c.length; i++) {
            int count = 0;
            String res = "";
            if (c[i] > 'a' && c[i] < 'z') {
                for (; i < c.length; i++) {
                    if (c[i] != ' ') {
                        count++;
                        res += c[i];
                    } else {
                        break;
                    }
                }
            }
            if (count > len) {
                s = res;
                len = count;
            }
        }
        System.out.println("The longest string is " + s + " and the length is " + len);
    }
}
