import java.util.Scanner;

public class CountOcurancesOfAllTheLettersPresentInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        while (s.length() > 0) {
            char ch = s.charAt(0);
            String s2 = s.replace(ch + "", "");
            int count = s.length() - s2.length();
            System.out.println(count + "" + ch);
            s = s2;
        }
    }
}