package week05.function;

import java.util.function.Function;

public class FunctionTest01 {
    public static void main(String[] args) {
        Function<String,Integer> lengthFunction01 = e -> e.length(); //e bir string
        Function<String,Integer> lengthFunction02 = (String e) -> e.length();
        //Function<T,R> T= Argüman type, R = Return type
        int result1 = lengthFunction01.apply("java");
        int result2 = lengthFunction01.apply("alperen");
        int result3= lengthFunction01.apply("ajsdfıowerjasdflkj");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
