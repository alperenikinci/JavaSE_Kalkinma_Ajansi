package week03.oop.principles.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Alperen");
        p1.setLastname("İkinci");
        p1.setAge(28);
        p1.setTcKimlik("12345678910");
        System.out.println("İsim : "+p1.getName()
                +"\nSoyisim : "+ p1.getLastname()
                + "\nYaş : "+p1.getAge());

    }
}
