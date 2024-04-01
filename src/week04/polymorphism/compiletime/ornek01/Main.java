package week04.polymorphism.compiletime.ornek01;

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int result1 = math.add(10,20); // int add(int a, int b) metodu cagirilir.
        double result2 = math.add(20.5,30.3); // double add(double a, double b) metodu cagirilir.
    }
}
