import java.util.Scanner;

public class DeleteDuplicateCharsWthtindxf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            boolean prsnt = false;
            for (int j = 0; j < res.length(); j++) {
                if (s.charAt(i) == res.charAt(j)) {
                    prsnt = true;
                }
            }
            if (!prsnt) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
