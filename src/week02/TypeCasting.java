package week02;

public class TypeCasting {

    public static void main(String[] args) {
        int dollar = 5;
        float dollarF = dollar;
        long dollarL = dollar;

        System.out.println("int dollar : " + dollar
                +"\nfloat dollar : " + dollarF
                +"\nlong dolar : " + dollarL);

        float floatDollar = 13.5f;
        int intDollar = (int) floatDollar;

        System.out.println("floatDollar : " + floatDollar+
                "\nintDollar : " + intDollar);

        long longDollar = 2;
        int intDollar2 = (int) longDollar;

        long longValue = 123456789101112L;
        int intValue = (int) longValue;
        System.out.println(longValue);
        System.out.println(intValue);

        float number1 = 5.3f;
        int sum = (int) (number1 + 5);
        System.out.println(sum);
        String sum2 = String.valueOf(sum);
        System.out.println(sum2);
        System.out.println((sum2+10));
        System.out.println((sum+10));




    }


}
