package week03.exceptions;

public class HandlingException2 {
    public static void main(String[] args) {

        String name = null;

        try {
            name.toUpperCase();
        }catch (NullPointerException e){
            e.printStackTrace();// try-catch'e almasak görünecek hatayı konsola yazdırır.
            System.out.println(e.getMessage());
            System.out.println("Caught NPE");
        } finally {
            System.out.println("finally block");
        }

    }
}
