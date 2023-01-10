package interviewPreparation;

public class Fibonacci {
    public static void main(String[] args) {
        int a=10;
        int b=1;
        int c=1;
        System.out.print(0+" "+b+" "+c+" ");
        for(int i=3;i<10;i++){
            int d=b+c;
            System.out.print(d+" ");
            b=c;
            c=d;
        
        }
        
      int e=  fib(10);
        System.out.println(e);
    }

    private static int fib(int count) {
        if (count <= 1)
            return count;

        return fib(count - 1) + fib(count - 2);
    }

//    int a=10;
}
