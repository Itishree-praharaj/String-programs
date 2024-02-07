import java.util.Scanner;

public class RemoveConsecutiveWordsFromASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            int count = 0;
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i].equals(s1[j])) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.print(s1[i] + " ");
            i += (count);
        }
    }
}
