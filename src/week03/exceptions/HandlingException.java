package week03.exceptions;

public class HandlingException {
    public static void main(String[] args) {
        int number1 = 5;
        int[] array = new int[3];
        try {
            System.out.println(array[3]);
            System.out.println((number1/0));
            System.out.println("try blok içi");
        }catch (ArithmeticException e){
            System.out.println("Caught ArithmethicException!");
        }catch (Exception e){
            System.out.println("Caught Exception");
        }finally {
            System.out.println("Merhaba");
            System.out.println("Dünya");
        }
        System.out.println("Kodun bitişi");



    }
}
