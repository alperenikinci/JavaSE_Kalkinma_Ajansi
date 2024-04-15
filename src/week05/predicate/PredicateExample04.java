package week05.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample04 {
    public static void main(String[] args) {
        List<String> stringTempList = new ArrayList<>();
        stringTempList.add("java");
        stringTempList.add("alperen");
        stringTempList.add("python");
        stringTempList.add("ali");
        stringTempList.add("hello");
        stringTempList.removeIf(str -> str.startsWith("a"));
        stringTempList.forEach(System.out::println);

        Predicate<String> predicate1 = String::isEmpty;
//        Predicate<String> predicate2 = String::length;
//        Predicate<String> predicate3 = String::startsWith;

    }
}
