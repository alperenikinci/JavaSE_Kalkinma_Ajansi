package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(4);
        numberList.add(11);
        numberList.add(4);
        System.out.println("Before sort " + numberList);
        Collections.sort(numberList);
        System.out.println("After sort " + numberList+"\n");
        Collections.sort(numberList,Collections.reverseOrder());
        System.out.println("After reverse " + numberList+"\n");
        numberList.sort(Collections.reverseOrder());
        System.out.println("After reverse " + numberList+"\n");

        System.out.println("Size : " + numberList.size()+"\n");

        ArrayList numberList2 = (ArrayList) numberList.clone();
        System.out.println("Clone List " + numberList2+"\n");

        ArrayList<Integer> numberList3 = numberList;
        System.out.println("Assigned List  " + numberList3 +"\n");

        System.out.println("Contains 1? "+numberList.contains(1)+"\n");
        System.out.println("Contains 4? "+numberList.contains(4)+"\n");
        System.out.println("isEmpty? " + numberList.isEmpty()+"\n");

        List<Integer> numberList4 = new ArrayList<>();
        System.out.println("isEmpty? " + numberList4.isEmpty()+"\n");

        System.out.println("indexOf 4 : "+numberList.indexOf(4)+"\n");
        System.out.println("indexOf 2 : "+numberList.indexOf(2)+"\n");

        System.out.println("for-each");
        for (Integer number : numberList){
            System.out.println(number);
        }
    }

}