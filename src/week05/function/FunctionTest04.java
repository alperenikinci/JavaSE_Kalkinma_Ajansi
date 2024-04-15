package week05.function;

import java.util.function.Function;

public class FunctionTest04 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = Utility::calculateLengthOfStr;
        System.out.println(f1.apply("Alperen"));
    }
}
