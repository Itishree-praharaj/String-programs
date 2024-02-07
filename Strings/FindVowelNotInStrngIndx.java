import java.util.Scanner;

class FindVowelNotInStrngIndx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); i++) {
            if (s.indexOf(vowels.charAt(i)) < 0) {
                System.out.println(vowels.charAt(i));
            }
        }
    }
}