import java.util.Scanner;

public class Permutations {
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s1 = sc.next();
        permutations(s1, 0, s1.length() - 1);
        System.out.println(count);
    }

    public static String swap(String s, int i, int j) {
        char c[] = s.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return new String(c);
    }

    public static void permutations(String s, int start, int end) {
        if (start >= end) {
            count++;
            System.out.println(s);
            return;
        }
        for (int i = start; i <= end; i++) {
            s = swap(s, start, i);
            permutations(s, start + 1, end);
        }
    }
}
