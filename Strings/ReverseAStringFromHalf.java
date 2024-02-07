import java.util.Scanner;

public class ReverseAStringFromHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s1 = sc.nextLine();
        String s2 = s1.substring(0, s1.length() / 2);
        s1 = s1.replace(s2, "");
        System.out.println(s1 + s2);
    }
}
