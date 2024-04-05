package week04.generics;

public class GenericsVarArgsExample {
    public static <T> void  printArray(T... items){
        for (T item : items){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("String Dizisi ");
        printArray("Merhaba","Dünya","Java");

        System.out.println("Integer Dizisi");
        printArray(1,2,3,4,"merhaba",6,7);

        System.out.println("Double Dizisi");
        printArray(3.14,9.80,2.718);
    }
}
