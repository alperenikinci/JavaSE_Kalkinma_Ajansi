package week04.lambda.ornek01;

public class LambdaFunctionTest01 {
    public static void main(String[] args) {
        LambdaFunction lambdaFunction = () -> System.out.println("Hello World!");
        lambdaFunction.message();
    }
}
