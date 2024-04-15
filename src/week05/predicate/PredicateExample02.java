package week05.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample02 {
    public static void main(String[] args) {
        List<String> myList = List.of("java","alperen","python","ali","hello");
        Stream<String>  myStream = myList.stream();

        Predicate<String> predicate1 = element -> element.length() >4;
        myStream.filter(predicate1).forEach(System.out::println);
    }
}
