package week04.lambda.ornek03;

public class LambdaFunctionExample03 {
    public static void main(String[] args) {

        LambdaFunctionalWithMultipleParameters oldLambda = new Lambda01();
        oldLambda.plus(3,5);

        LambdaFunctionalWithMultipleParameters lambda = ((number1, number2) -> {
            System.out.println("Plus is : " + (number1+number2));
        });
        lambda.plus(10,5);
    }
}
