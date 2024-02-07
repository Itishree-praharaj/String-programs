import java.util.Scanner;

public class FindTheVowelsNotPresentInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); i++) {
            boolean present = false;
            for (int j = 0; j < s.length(); j++) {
                if (vowels.charAt(i) == s.charAt(j))
                    present = true;
            }
            if (!present)
                System.out.println(vowels.charAt(i));
        }
    }
}
