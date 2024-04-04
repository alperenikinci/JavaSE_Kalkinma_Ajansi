package week04.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample04 {
    public static void main(String[] args) {
        HashMap<Integer, String> languageHashMap = new HashMap<>();
        languageHashMap.put(1,"Java");
        languageHashMap.put(2,"Python");
        languageHashMap.put(3,"C");
        languageHashMap.put(4,"Java");
        System.out.println("HashMap : " +languageHashMap);

        // anahtarlar üzerinden iterasyon
        System.out.println("Iteration through keys  ");
        for (Integer key : languageHashMap.keySet()){
            System.out.print(key);
            System.out.print(", ");
        }

        // değerler üzerinden iterasyon
        System.out.println("Iteration through values  ");
        for (String value : languageHashMap.values()){
            System.out.print(value);
            System.out.print(", ");
        }

        // anahtar/deger çifti üzerinden iterasyon
        System.out.println("Iteration through key/value pairs");
        for (Map.Entry<Integer,String> entry:languageHashMap.entrySet()){
            System.out.println(entry);
        }
    }

}
