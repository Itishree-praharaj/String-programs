import java.util.Scanner;

public class DivideTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        if (s.length() % 2 != 0) {
            System.out.println("String cannot be divided");
            return;
        }

        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
