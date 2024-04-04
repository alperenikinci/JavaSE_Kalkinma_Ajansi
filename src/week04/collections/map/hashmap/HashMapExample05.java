package week04.collections.map.hashmap;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExample05 {
    public static void main(String[] args) {
        TreeMap<String,Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two",2);
        evenNumbers.put("Four",4);
        evenNumbers.put("Six",6);
        evenNumbers.put("Eight",8);
        System.out.println("TreeMap : "+ evenNumbers);

        //TreeMap üzerinden HashMap oluşturmak.
        HashMap<String,Integer> numberHashMap= new HashMap<>(evenNumbers);
        System.out.println("HashMap : " + numberHashMap);
    }
}
