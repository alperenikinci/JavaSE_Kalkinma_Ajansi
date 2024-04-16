package week05.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        //peek()
        Stream.of("one","two","three","four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value : " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value : " + e))
                .collect(Collectors.toList());

        Stream.of(1,2,3,4,5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i*i)
                .peek(i -> System.out.printf("%d ",i))
                .collect(Collectors.toList());

        // filter() -> Verilen koşula uymayan elamanların kaldırılması için kullanılır.
        IntStream.rangeClosed(0,10)
                .filter(i -> i%2 == 0)
                .map(i -> i*3)
                .forEach(System.out::println);

        // Empty String'leri kaldırmak için filter() metodu kullanalım.
        Stream.of("Alperen","Muhammet","","Mustafa")
                .filter(name -> !name.isEmpty())
                .forEach(System.out::println);

        // distinct() -> yinelenen (duplicate) değerlerin(value)
        // kaldırıldığı(remove) bir stream döndürür.

        Stream.of("Java","Java","Java8","JAva")
                .distinct()
                .forEach(System.out::println);

        // skip() & limit()
        // skip(n) discard(görmezden gelme) işlemidir. n negatif olamaz.
        // limit(n) istenen boyuttan daha uzun olmayan bir stream döndüren intermediate op.
        Stream.iterate(10, n-> n+2)
                .skip(3) //10, 12, 14 değerleri(ilk 3 değer) atlanmış, Bir sonraki değerden devam edilmiş.
                .limit(5)
                .forEach(System.out::println);

        // map() -> verileri dönüştürmek için kullanılır.
        // Map interface'indeki Key, Value çifti tutan yapıyla karıştırılmamalı.
        Stream<String> s = Stream.of("Alperen","Ali","Ayşe");
        s.map(String::length).forEach(System.out::println);

        List<String> stringList = Arrays.asList("1","2","3","4","5","6");
        List<Integer> evenNumberList = stringList.stream()
                .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumberList);

        //sorted() -> doğal sıralamaya göre sıralar. Comparable interface'inden implement edilen öğeleri
        //barındırdığı sürece efektif bir şekilde çalışır.
        //Stream<T> sorted(Comparator<? super T> comparator);
        Stream<String> s1= Stream.of("brown","bear-","bee");
        s1.sorted().forEach(System.out::println);
        // Not! sorted() metodunu kullandığımızda 'Java.lang.OutOfMemoryError:Java heap space' sonucunu
        // elde edebiliriz.

        Stream.generate(()-> "Luci")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

    }

}
