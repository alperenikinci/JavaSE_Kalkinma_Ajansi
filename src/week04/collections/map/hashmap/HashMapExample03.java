package week04.collections.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample03 {
    public static void main(String[] args) {
        Map<String,List<String>> hashMap= new HashMap<>();
        hashMap.put("Ankara",List.of("Polatlı","Yenimahalle","Çankaya","Kazan"));
        hashMap.put("İstanbul",List.of("Kadıköy","Beyoğlu","Üsküdar","Beylikdüzü"));
        Map<String,Map<String,List<String>>> nestedHashMap = new HashMap<>();
        nestedHashMap.put("Türkiye",hashMap);

        for (Map.Entry<String,Map<String,List<String>>> entry:nestedHashMap.entrySet()){
            System.out.println(entry.getKey());
            for (Map.Entry<String,List<String>> entry1:entry.getValue().entrySet()){
                System.out.println("\t"+entry1.getKey());
                for (String county : entry1.getValue()){
                    System.out.println("\t\t" + county);
                }
            }
        }

//        nestedHashMap.forEach((k,v) -> System.out.println(k + "\n"),(v.forEach((k1,v1) -> System.out.println(k + "\n" + v) )));
    }
}
