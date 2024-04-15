package week05.predicate;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample01 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = element -> element.startsWith("a");
        // 1 tane parametre alıyorsa ve veri türünü belirlemediysek paranteze gerek yok.

        Predicate<String> predicate2 = (String element) -> element.startsWith("a");
        // veri türünü belirttiğimiz için parantez gerekti.

        Predicate<String> predicate3 = (String element ) -> {
          return element.startsWith("a");
        };

        // Yukarıdaki 3 predicate kullanımı da aynı anlama gelir, aynı şekilde çalışır.
        Stream.of("java","alperen","python","ali","hello").filter(predicate1).forEach(System.out::println);
        List<String> list =  Stream.of("java","alperen","python","ali","hello").filter(predicate1).collect(Collectors.toList());
        System.out.println(list);

    }
}
