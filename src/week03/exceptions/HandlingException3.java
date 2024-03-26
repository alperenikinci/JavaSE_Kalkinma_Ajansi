package week03.exceptions;

public class HandlingException3 {
    public static void main(String[] args) {
        String name = null;

        if(name==null){
            System.out.println("Lutfen bir isim giriniz!");
        } else {

            System.out.println(  name.toUpperCase());
        }
    }
}
