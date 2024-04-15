package week05.diamond_problem;

public interface MyInterface1 {
    //default ayarlarda metodun access modifier'ı public olduğu için gri gösteriyor
    public  default void defaultMethod(){
        System.out.println("MyInterface1 defaultMethod");
    }

    //Interface'de varsayılan olarak bütün methodlar abstract gelir. O yüzden gri görünüyor.
    abstract void test();
}
