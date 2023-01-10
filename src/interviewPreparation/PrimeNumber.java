package interviewPreparation;

public class PrimeNumber {
    public static void main(String[] args) {
        int a=10;

    boolean b=    checkPrime(a);

        System.out.println(b);

    }
    public static boolean checkPrime(int a){
        if(a==1 || a==0){
            return false;
        }
        if(a==2){
            return true;
        }
        for(int i=2;i<a/2;i++){
            if(a%2==0){
                return false;
            }
        }
        return true;
    }
}
