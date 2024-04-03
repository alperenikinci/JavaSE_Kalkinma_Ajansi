package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {
        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("Kedi");
        animalList.add("Köpek");
        animalList.add("Mirket");
        animalList.add("Rakun");

        System.out.println("ArrayList : " + animalList);

        String str = animalList.get(1);
        System.out.println("Element at index 1 is : " + str);
        int i = 0;
        System.out.println("Element at index 0 is : " + animalList.get(i));
    }

 }
