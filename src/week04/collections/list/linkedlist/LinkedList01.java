package week04.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[] args) {
        //FIFO felsefesiyle çalışır. (First in First out) -> İlk gelen ilk çıkar.
        Queue<String> languageQueue = new LinkedList<>();

        //Elamanlar ekleyelim.
        languageQueue.add("Python");
        languageQueue.add("Java");
        languageQueue.add("C");
        System.out.println("LinkedList : " + languageQueue);

        //En baştaki elemana erişelim.
        String str1 = languageQueue.peek(); //en baştaki elemanı görüntüler.
        System.out.println("Accessed Element : " + str1);

        //En baştaki elemana erişelim, aynı zamanda da listeden çıkaralım.
        String str2 = languageQueue.poll();
        System.out.println("Removed element : " + str2);
        System.out.println("LinkedList after poll() : " +languageQueue);

        //Listenin sonuna eleman ekleyelim.
        languageQueue.offer("Swift");
        System.out.println("LinkedList after offer() : " + languageQueue);

    }

}
