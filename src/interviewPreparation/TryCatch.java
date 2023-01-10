package interviewPreparation;

public class TryCatch {
    public static void main(String[] args) {
        int a=2;
        try {
            int c = a / 2;
        }
        catch (Exception e){
            System.out.println("Hello0");
        }
        finally {
            System.out.println("Hi");
        }
    }
}
