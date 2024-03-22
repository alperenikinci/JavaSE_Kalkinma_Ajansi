package week02;
public class SingleOperator {

    public static void main(String[] args) {
        int number1 = 87, number2 = 13;
        boolean condition = true;

        //On artirma ve Azaltma Operatoru
        System.out.println("(A) Degeri : " + number1 + "\t(++A) Degeri " + (++number1));
        System.out.println("(B) Degeri : " + number2 + "\t(--B) Degeri " + (--number2));

        // Sonra artirma ve azaltma operatoru:
        System.out.println("(A) Degeri : " + number1 + "\t(A++) Degeri " + (number1++));
        System.out.println("(B) Degeri : " + number2 + "\t(B--) Degeri " + (number2--));

        System.out.println(" A degeri = " + number1 + " B degeri = " + number2);

        // Mantiksal degil operatoru
        System.out.println("Degil (!): " + !condition);
    }
}
