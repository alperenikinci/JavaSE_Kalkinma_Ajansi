package week04.generics;

public class GenericClassTExtendsA <T extends Number> {

    public void display(){
        System.out.println("This is a bounded type generics class. ");
    }
    public static void main(String[] args) {

        //GenericClassTExtendsA<String> strObj = new GenericClassTExtendsA<String>();
        //Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
        GenericClassTExtendsA<Integer> intObj = new GenericClassTExtendsA<Integer>();

    }
}
