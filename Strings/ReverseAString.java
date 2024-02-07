import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        char temp = ' ';
        while (start < end) {
            temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        System.out.println(c);
    }
}
