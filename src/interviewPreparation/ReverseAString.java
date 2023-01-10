package interviewPreparation;

public class ReverseAString {
    public static void main(String[] args) {
        String s="123";
        String s1 = "abc";
        String s2 = "abc";
        if(s1==s2){
            System.out.println("Hello");
        }

        System.out.println("s1 == s2 is:" + s1 == s2);
        String rev="";

        //Using String Builder

        StringBuilder stringBuilder=new StringBuilder("ABCD");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


        //Using String
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
            System.out.println(s.charAt(i));
        }
        System.out.println(rev);
    }
}