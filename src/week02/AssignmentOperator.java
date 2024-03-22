package week02;

public class AssignmentOperator {

    public static void main(String[] args) {
        byte byteNumber = 126;
        short shortNumber = 326;
        int intNumber = 1058;
        long longNumber = 12042;
        float floatNumber = 42.8f;
        double doubleNumber = 8.58;
        char character = 'A';
        boolean booleanInformation = true;

        //Referans Veri Tipleri (String ile sınırlıdır)
        String myText = "Merhaba !" , myWeb = "www.bilgeadam.com";

        //Ekrana yazdirma komutlari

        System.out.println(myText
                +"\nByte Degeri:" +byteNumber
                +"\nShort Degeri:"+shortNumber
                +"\nInteger Degeri:"+intNumber
                +"\nLong Degeri:" +longNumber
                +"\nFloat Degeri:" + floatNumber
                +"\nDouble Degeri:" + doubleNumber
                +"\nChar Degeri:"+character
                +"\nBoolean Degeri:"+booleanInformation);
        System.out.println(myWeb);
    }
}
