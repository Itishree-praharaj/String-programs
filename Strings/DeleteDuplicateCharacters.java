import java.util.Scanner;

public class DeleteDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (res.indexOf(s.charAt(i)) < 0) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
