package week04.collections.list.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Java","C#","Python");

//        nameList.replaceAll(String::toUpperCase);
        System.out.println(nameList);

        for (String name:nameList){
            nameList.set(nameList.indexOf(name),name.toUpperCase());
        }
        System.out.println(nameList);
    }
}
