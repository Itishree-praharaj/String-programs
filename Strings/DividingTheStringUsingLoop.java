import java.util.Scanner;

public class DividingTheStringUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        String firsthalf = "";
        String secondhalf = "";
        int start = 0, mid = s.length() / 2, end = s.length() - 1;
        while (mid <= end) {
            firsthalf += s.charAt(start);
            if (start != mid)
                secondhalf += s.charAt(mid);
            start++;
            mid++;
        }
        System.out.println(firsthalf);
        System.out.println(secondhalf);
    }
}
