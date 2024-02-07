import java.util.Scanner;

public class SumOfAlltheNumbersInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char num = s.charAt(i);
            if (num >= '0' && num <= '9') {
                String sn = "";
                for (; i < s.length(); i++) {
                    if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                        sn += s.charAt(i);
                    } else {
                        break;
                    }
                }
                sum += Integer.parseInt(sn);
            }
        }
        System.out.println("The sum of all the numbers present in the string is " + sum);
    }
}
