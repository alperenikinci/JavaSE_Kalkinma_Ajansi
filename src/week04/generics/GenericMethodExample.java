package week04.generics;

public class GenericMethodExample {

    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5};
        Double[] doubleArray = {1.3,2.6,3.9,4.12,5.55};
        String[] stringArray = {"apple","banana","pineapple","cherry","watermelon"};

        System.out.println("Integer array");
        printArray(integerArray);

        System.out.println("Double array");
        printArray(doubleArray);

        System.out.println("String array");
        printArray(stringArray);

    }

}
