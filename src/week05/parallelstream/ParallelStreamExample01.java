package week05.parallelstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamExample01 {

    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream();
        Stream<Integer> parallelStream = stream.parallel();
        System.out.println(parallelStream.count());

        Stream<Integer> parallelStream2 = Arrays.asList(1,2,3,4,5,6).parallelStream();
        System.out.println(parallelStream2.count());

        Arrays.asList("racoon","jackal","kangaroo","wolf").parallelStream().map(s-> {
            System.out.println(s);
            return s.toUpperCase();
        }).forEach(System.out::println);
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i<50000;i++){
            myList.add(i);
        }
        long startTime = 0;
        long timeElapsed = 0;
        startTime = System.nanoTime();
        List<Integer> parallelStreamList =  myList.parallelStream().map(s -> {
            s = s*2;
            s+=1;
            return s;
        }).collect(Collectors.toList());
        timeElapsed = System.nanoTime()-startTime;
        System.out.println("Elapsed time for parallelStreamList : " +timeElapsed);
//         startTime = System.nanoTime();
//        List<Integer> streamList =  myList.stream().map(s -> {
//            s = s*2;
//            s+=1;
//            return s;
//        }).collect(Collectors.toList());
//        timeElapsed = System.nanoTime()-startTime;
//        System.out.println("Elapsed time for streamList : " +timeElapsed);
        System.out.println(Long.MAX_VALUE);



    }
}
