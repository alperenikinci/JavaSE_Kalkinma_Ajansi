package week04.wrapper;

public class BoxingUnboxing {
    int number = 2;
    Integer integer = number; // auto boxing
    Integer integer2 = 5; // auto boxing
    int number2 = integer2; // auto unboxing

    //boxing
    Integer boxing = new Integer(100);
    Integer boxing2 = Integer.valueOf(100);

    //Auto unboxing
    Integer number3 = 100; // autoboxing
    int autoUnboxing = number3; // auto unboxing

    //Unboxing
    int unBoxing = number3.intValue();
}
