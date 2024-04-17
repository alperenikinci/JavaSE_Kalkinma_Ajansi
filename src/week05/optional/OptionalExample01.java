package week05.optional;

import java.util.Optional;

public class OptionalExample01 {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> opt1 = Optional.of("Value");
        System.out.println(opt1);
        System.out.println(opt1.get());
        System.out.println(emptyOptional);
//        System.out.println(emptyOptional.get()); // ->NoSuchElement hatası fırlatır.
    }
}
