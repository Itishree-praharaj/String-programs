import java.util.Scanner;

public class RotationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println("enter the rotation number");
        int rotation = sc.nextInt();
        String res = s.substring(rotation) + s.substring(0, rotation);
        System.out.println(res);
    }
}
