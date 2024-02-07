import java.util.Scanner;

public class DivideStringAcrdUserInputWithoutMeth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println("Enter the number of divisons");
        int div = sc.nextInt();
        if (s.length() % div != 0) {
            System.out.println("String cannot be divided");
            return;
        }
        String res = "";
        int len = s.length() / div;
        int start = 0, end = len;
        for (int i = 1; i <= div; i++) {
            while (start < end) {
                res += s.charAt(start);
                start++;
            }
            start = end;
            end += len;
            res += " ";
        }
        System.out.println(res);
    }
}
