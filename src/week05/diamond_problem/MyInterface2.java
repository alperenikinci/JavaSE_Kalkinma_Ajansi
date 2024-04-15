package week05.diamond_problem;

public interface MyInterface2 {
    //default ayarlarda metodun access modifier'ı public olduğu için gri gösteriyor
     public default void defaultMethod(){
        System.out.println("MyInterface2 defaultMethod");
    }

    //Interface'de varsayılan olarak bütün methodlar abstract gelir. O yüzden gri görünüyor.
    abstract void test();
}
