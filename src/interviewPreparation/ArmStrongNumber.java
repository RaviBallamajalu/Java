package interviewPreparation;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int i=371;
        int num=0;
        int temp=i;
        while(i>0){
            int rem=i%10;
            num= (int) Math.pow(rem,3)+num;
            i=i/10;
        }

        if(temp==num){
            System.out.println("ArmSTrongNumber");
        }
        else {
            System.out.println("NotArmStrong");
        }
    }
}
