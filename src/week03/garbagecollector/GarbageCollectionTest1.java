package week03.garbagecollector;

public class GarbageCollectionTest1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "Eşek";

        Animal animal2 = new Animal("Eşek");

        System.out.println(animal1.name + " " + animal2.name);
        animal1 = null; /*Garbage collector tam burada
         devreye girer ve Heap alanından animal1 objesini temizler*/
        animal2 = null; /*Garbage collector tekrar devreye girdi.*/

    }
}
