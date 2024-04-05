package week04.threads;

public class ThreadExample {
    public static void main(String[] args) {
        // Runnable arayüzü ile thread oluşturma
        Runnable task1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 - Count: " + i);
                try {
                    Thread.sleep(1000); // 1 saniye bekle
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 - Count: " + i);
                try {
                    Thread.sleep(700); // 0.7 saniye bekle
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start(); // Thread 1'i başlat
        thread2.start(); // Thread 2'yi başlat

        try {
            thread1.join(); // Thread 1'in bitmesini bekle
            thread2.join(); // Thread 2'nin bitmesini bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread Sonlandı.");
    }
}