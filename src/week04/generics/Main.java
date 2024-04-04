package week04.generics;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println("Generic Class returns : " + intObj.getData());

        GenericClass<String> stringObj = new GenericClass<>("Java Programming");
        System.out.println("Generic Class returns : " + stringObj.getData());

    }
}
