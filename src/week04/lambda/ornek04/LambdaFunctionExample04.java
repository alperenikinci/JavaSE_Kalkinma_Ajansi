package week04.lambda.ornek04;


public class LambdaFunctionExample04 {
    public static void main(String[] args) {

        LambdaCalculator lambda01 = ((number1, number2) -> {
         return number1+number2 ;
        });
        LambdaCalculator lambda02 = ((int number1, int number2) -> number1-number2);
        LambdaCalculator lambda03 = ((int number1, int number2) -> number1*number2);
        LambdaCalculator lambda04 = ((int number1, int number2) -> number1/number2);
        System.out.println(lambda01.process(10,15));
        System.out.println(lambda02.process(10,15));
        System.out.println(lambda03.process(10,15));
        System.out.println(lambda04.process(10,15));

    }
}
