package week03.arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        String[] strArray = new String[100];
        int[] numbers = new int[30];
        double[] doubleArray = new double[18];

        //yontem 1 -> direct instantiate;
        long[] longArray = {10,15,20};

        //yontem 2 ->  allocate first, assign later
        long[] longArray2 = new long[3];
        longArray2[0]= 10;
        longArray2[1]= 15;
        longArray2[2]= 20;

        System.out.println("1. eleman : " + longArray2[0]);
        System.out.println("2. eleman : " + longArray2[1]);
        System.out.println("3. eleman : " + longArray2[2]);
        System.out.println(longArray2);
//[J@3feba861
        long[] longArray3 = new long[100000000];
        System.out.println(longArray3);


    }
}
