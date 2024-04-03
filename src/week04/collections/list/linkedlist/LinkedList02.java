package week04.collections.list.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        Deque<String> animalList = new LinkedList<>();

        //İlk indexten eleman ekleme.
        animalList.add("Cow");
        System.out.println("LinkedList : " + animalList);
        animalList.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animalList);

        //Son indexten eleman ekleme.
        animalList.addLast("Cat");
        System.out.println("LinkedList after addLast() : " + animalList);

        //İlk indexten eleman silme.
        animalList.removeFirst();
        System.out.println("LinkedList after removeFirst() : " + animalList);

        //Son indexten eleman silme.
        animalList.removeLast();
        System.out.println("LinkedList after removeLast() : " + animalList);

    }
}
