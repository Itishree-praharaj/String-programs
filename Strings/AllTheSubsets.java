import java.util.Scanner;

public class AllTheSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                System.out.println(s.substring(i, j + 1));
            }
        }
    }
}
