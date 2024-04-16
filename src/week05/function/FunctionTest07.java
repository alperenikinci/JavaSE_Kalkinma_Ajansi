package week05.function;

import java.util.function.Function;

public class FunctionTest07 {
    public static void main(String[] args) {
        //metin dizgisini alıp uzunluğunu hesaplayan bir function.
        Function<String,Integer> stringLength = String::length;
        // Uzunluğu alınan metin dizgisini alıp, uzunluğun karesini hesaplayan bir function.
        Function<Integer,Integer> squareOfLength = n -> (int) Math.pow(n,2);

        // bu iki function'ı birleştirip bir arada uygulayan function.
        Function<String,Integer> combinedFunction = stringLength.andThen(squareOfLength);
        System.out.println(combinedFunction.apply("Alperen"));
    }
}
