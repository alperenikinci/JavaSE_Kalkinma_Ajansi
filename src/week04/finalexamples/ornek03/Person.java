package week04.finalexamples.ornek03;

public class Person {

    private final String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    } -> Degisken final oldugu için bu metodu kullanamam. İzin vermez.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
