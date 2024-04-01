package week04.polymorphism.compiletime.ornek02;

public class Calculator {
    int sum(int a, int b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
