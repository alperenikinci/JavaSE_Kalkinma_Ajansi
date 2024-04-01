package week04.polymorphism.compiletime.ornek02;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(10,20));
        System.out.println(calculator.sum(10.5,20.5));
        System.out.println(calculator.sum(10,20,30));
        System.out.println(calculator.sum(10,20,30,40));
    }
}
