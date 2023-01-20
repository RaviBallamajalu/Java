package oOps;

import java.util.function.Predicate;
public class PredicateInterfaceExample {  

    public static void main(String[] args){  
        // Using Predicate interface  
        boolean b= PredicateInterfaceExample.checkAge(215);
        // Calling Predicate method  
       // boolean result = predicate.test(25);
        //System.out.println(result);
    }

    private static boolean checkAge(Integer integer) {

        return true;
    }
}  