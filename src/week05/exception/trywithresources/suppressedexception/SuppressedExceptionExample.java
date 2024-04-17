package week05.exception.trywithresources.suppressedexception;

import java.io.IOException;
import java.util.Arrays;

public class SuppressedExceptionExample {
    public static void main(String[] args) {
        try(Computer computer = new Computer()) {
            System.out.println("try block!!");
            int number = 1/0; //1. exception
        } catch (Exception e){
            System.out.println("Catch block");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getSuppressed()));
        }
    }
}
