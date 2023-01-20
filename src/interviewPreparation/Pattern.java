package interviewPreparation;

public class Pattern {
    public static void main(String[] args) {
        int N = 5;

        for (int i = 0; i <=N; i++) {
            for (int j = 0; j <=N; j++) {
                if (i>=j) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
