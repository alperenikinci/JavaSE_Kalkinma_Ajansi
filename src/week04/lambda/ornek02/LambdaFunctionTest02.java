package week04.lambda.ornek02;

import week04.lambda.ornek02.LambdaFunctionWithParameter;

public class LambdaFunctionTest02 {
    public static void main(String[] args) {
        LambdaFunctionWithParameter function = (String message) -> System.out.println(message);
        LambdaFunctionWithParameter function2 = (message) -> System.out.println(message);
        LambdaFunctionWithParameter function3 = message -> System.out.println(message);
        LambdaFunctionWithParameter function4 = (message) -> {
            System.out.println(message);
        };
        LambdaFunctionWithParameter function5 = System.out::println;
        function.message("HelloWorld!");
        function2.message("HelloWorld!");
        function3.message("HelloWorld!");
        function4.message("HelloWorld!");
        function5.message("Hello Lambda Expression");

    }
}
