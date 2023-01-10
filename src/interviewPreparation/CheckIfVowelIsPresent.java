package interviewPreparation;

public class CheckIfVowelIsPresent {
    public static void main(String[] args) {
        String a = "qqqqq";
        a.toLowerCase();

       boolean b= checkVowels(a);
        System.out.println(b);
    }

    private static boolean checkVowels(String a) {
        System.out.println(a.matches(".*[a,e,i,o,u].*"));

            return a.toLowerCase().matches(".*[aeiou].*");



    }
}
