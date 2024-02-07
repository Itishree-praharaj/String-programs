import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        System.out.println("Enter the rotation");
        int rotation = sc.nextInt();
        String res = s.substring(s.length() - rotation) + s.substring(0, s.length() - rotation);
        System.out.println(res);
    }
}
