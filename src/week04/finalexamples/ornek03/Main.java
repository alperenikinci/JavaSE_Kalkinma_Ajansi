package week04.finalexamples.ornek03;

public class Main {
    public static void main(String[] args) {
        final Person person = new Person("Alperen");
        person.setAge(10);
        System.out.println(person.getName()+ " " + person.getAge());
//        person = new Person("Mert"); -> person'a yeni person değeri atanamaz.
    }
}
