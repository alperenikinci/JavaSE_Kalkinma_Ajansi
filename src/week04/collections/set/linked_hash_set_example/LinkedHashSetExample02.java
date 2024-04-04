package week04.collections.set.linked_hash_set_example;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample02 {
    public static void main(String[] args) {
        Set<Integer> evenNumbers = new LinkedHashSet<>();
        evenNumbers.add(8);
        evenNumbers.add(6);
        evenNumbers.add(4);

        Set<Integer> oddNumbers =   new LinkedHashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        oddNumbers.add(8);
        oddNumbers.add(6);

        evenNumbers.addAll(oddNumbers);
        System.out.println(evenNumbers);

        System.out.println("for-each");
        for(Integer number: evenNumbers) {
            System.out.println(number);
        }

        System.out.println("iterator");
        Iterator<Integer> iterator = evenNumbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
