package week05.predicate;

import java.util.function.Predicate;

public class PredicateExample03 {
    public static void main(String[] args) {
        Predicate<String> nullCheckPredicate = e -> e!=null;
        Predicate<String> lengthCheckPredicate = e -> e.length() >5;

        Predicate<String> andPredicate = nullCheckPredicate.and(lengthCheckPredicate);

        String temp1 = null;
        String temp2 = "java";
        String temp3 = "alperen";
        String temp4 = "python";
        String temp5 = "ali";
        String temp6 = "hello";

        System.out.println(andPredicate.test(temp1));
        System.out.println(andPredicate.test(temp2));
        System.out.println(andPredicate.test(temp3));
        System.out.println(andPredicate.test(temp4));
        System.out.println(andPredicate.test(temp5));
        System.out.println(andPredicate.test(temp6));


    }
}
