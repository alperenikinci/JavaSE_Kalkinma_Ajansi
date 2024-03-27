package week03.oop;

public class Test {
    public static void main(String[] args) {
        ClassName className1 = new ClassName();
        System.out.println(className1.sayHello("Alperen"));
        System.out.println(className1.sum(1,5));

        ClassName className2= new ClassName();
        System.out.println(className2.sayHello("Mustafa"));
        System.out.println(className2.sum(8,12));

        Person p1 = new Person();
        p1.name = "Alperen";
        p1.gender= "Male";
        p1.nickname = "Alp";
        p1.sleep();
        p1.walk();

        Person p2 = new Person();
        p2.name = "Gamze";
        p2.nickname = "Farketmez";
        p2.walk();
        p2.sleep();

        System.out.println(p2.nickname);
    }
}
