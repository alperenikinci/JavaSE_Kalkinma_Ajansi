package week04.threads;

import java.util.Arrays;
import java.util.Random;

public class ThreadSumExample {
    public static void main(String[] args) {
        int[] numbers = generateNumbersArray(100);
        int[] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length / 2);
        int[] secondHalf = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);

        SumThread firstThread = new SumThread(firstHalf);
        SumThread secondThread = new SumThread(secondHalf);

        firstThread.start();
        secondThread.start();
        try {
            firstThread.join();
            System.out.println(secondThread.getSum());
//            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = firstThread.getSum() + secondThread.getSum();
        System.out.println("Toplam Sonuç: " + totalSum);
    }

    private static int[] generateNumbersArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100); // 0-99 arası rastgele sayılar
        }
        return numbers;
    }
}

class SumThread extends Thread {
    private int[] numbers;
    private int sum;

    public SumThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println("run method length: " + numbers.length);
        System.out.println("run method 0 index :  " + numbers[0]);
        for (int number : numbers) {
            sum += number;
        }
    }

    public int getSum() {
        return sum;
    }
}