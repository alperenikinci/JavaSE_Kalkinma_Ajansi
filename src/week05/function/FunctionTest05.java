package week05.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest05 {
    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> incrementExact = Math::incrementExact;

        //ikisi de aynı işi yapıyor. İlkinde önce parseInt
        // metodunu calistirip sonra andThen ile 2. metodu calistiriyoruz.
        Function<String, Integer> parseIntAndIncrementExact = parseInt.andThen(incrementExact);
        //compose ile yapılması durumunda da önce argüman işleniyor.
        // ondan sonra solundaki metot (incrementExact) calisiyor.
        Function<String, Integer> compose = incrementExact.compose(parseInt);

        Stream.of("-3","11","25","30","-1","-11")
                .map(parseIntAndIncrementExact).forEach(System.out::println);
        //map() metodu String objelerini Integer objelerine cevirmek icin kullanildi.

        System.out.println("-----------------------");
        // Uzun yöntem.
        List<String> stringList = Arrays.asList("a a","b b","c c","d d");
        Function<String,String> upperCase = String::toUpperCase;
        stringList.stream().map(upperCase).forEach(System.out::println);

        // Kısa yöntem
        stringList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
