package week03.methods;

public class ReturnMethods {
    public static void main(String[] args) {
        int sum = sum(5,10);
        int sum2 =sum(10,15);
        System.out.println(sum);
        System.out.println(sum2);

        int sum3 = sum(sum,sum2);
        System.out.println(sum3);

        int sum4 = sum(sum(10,15),sum(sum(5,10),sum(10,15)));
        System.out.println(sum4);
    }

     static int sum(int number1, int number2){
        return number1+number2;
    }
}
