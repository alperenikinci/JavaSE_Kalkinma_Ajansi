package week04.polymorphism.runtime.ornek02;

public class Terrier extends Dog{

    int size = 2;

    @Override
    void feetSize() {
        System.out.println("Terrier's feetSize");
    }

    @Override
    void gender() {
        System.out.println("Female");
    }
}
