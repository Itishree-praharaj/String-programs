import java.util.Scanner;

public class DivideStringAcrdngToUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println("Enter the number of divison");
        int noOfDiv = sc.nextInt();
        if (s.length() % noOfDiv != 0) {
            System.out.println("It cannot be divided");
            return;
        }
        String res[] = new String[noOfDiv];
        int len = s.length() / noOfDiv;
        int start = 0, end = len;
        for (int i = 0; i < res.length; i++) {
            res[i] = s.substring(start, end);
            start = end;
            end += len;
        }
        for (String s2 : res) {
            System.out.print(s2 + " ");
        }
    }
}
