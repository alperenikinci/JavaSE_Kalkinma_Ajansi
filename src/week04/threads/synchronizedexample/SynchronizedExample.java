package week04.threads.synchronizedexample;

public class SynchronizedExample {
    private int count;
    public synchronized void increment(){
        count++;
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();
        Thread thread1 = new Thread(()-> {
           for (int i =0 ; i<10000; i++){
               example.increment();
           }
        });
        Thread thread2 = new Thread(()-> {
            for (int i =0 ; i<10000; i++){
                example.increment();
            }
        });
        thread1.start();
        thread2.start();
        try {

            thread1.join();
            System.out.println(example.count);
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Sonuç : " + example.count);
    }
}
