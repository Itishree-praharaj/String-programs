import java.util.Scanner;

public class OccuranecOfLetterInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the letter to check the occurances");
        String letter = sc.next();
        int occurance = s.length() - s.replace(letter, "").length();
        System.out.println("The occurance of " + letter + " is " + occurance);
    }
}
