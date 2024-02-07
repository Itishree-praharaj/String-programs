import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        char l[] = s.toCharArray();
        for (int i = 0; i < l.length; i++) {
            char count = '1';
            for (int j = i + 1; j < l.length; j++) {
                if (l[i] != ' ') {
                    if (l[i] == l[j]) {
                        count++;
                        l[j] = (char) count;
                    }
                }
            }
            if (count != '1') {
                l[i] = '1';
            }
        }
        System.out.println(l);
    }
}
