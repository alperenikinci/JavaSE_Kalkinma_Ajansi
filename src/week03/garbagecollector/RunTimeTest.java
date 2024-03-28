package week03.garbagecollector;

import java.util.Date;

public class RunTimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory : " + runtime.totalMemory());
        System.out.println("Free Memory : " + runtime.freeMemory());

        Date d = null;
        for (int i = 0; i<10000000;i++){
            d = new Date();
            d = null;
        }

        System.out.println("After Free Memory : " + runtime.freeMemory());
        System.gc();
        System.out.println("After GC Memory : " + runtime.freeMemory());
    }
}
