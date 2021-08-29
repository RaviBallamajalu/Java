import java.util.Scanner;

public class CaseDetectionOfALetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /* to detect the case of letter*/
        char c = scan.next().trim().charAt(0);
        if (c >= 'a' && c <= 'z') {
            System.out.println("Small letter char : " + c);
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("Upper case char : " + c);
        } else {
            System.out.println("Other Than Alphabet : " + c);
        }


        /* to detect the case of String*/

        System.out.println("Enter a string");
        String a = scan.next();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch != ' ') {
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println("Small letter char : " + ch);
                } else if (ch >= 'A' && ch <= 'Z') {
                    System.out.println("Upper case char : " + ch);
                } else {
                    System.out.println("Other Than Alphabet : " + ch);
                }
            }
        }
    }
}
