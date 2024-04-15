package week05.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest03 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6);
        //consumer kullanarak her bir sayıyı ikiye bölen işlemi uygulayalım.
        Consumer<Integer> divideByTwo = number -> {
            System.out.println(number + " divided by 2 is " + (number/2));
        };

        numberList.forEach(divideByTwo);
    }
}
