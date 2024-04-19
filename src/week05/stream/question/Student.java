package week05.stream.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {

//    static Random random = new Random();
    private String name;
    private String surname;
    private final Integer grade;

    public Student(String name, String surname) {

        this.name = name;
        this.surname = surname;
//        this.grade = random.nextInt(0,101);
        this.grade = generateGrade();
    }

    private Integer generateGrade(){
        return new Random().nextInt(0,101);
    }

    public static Double calculateAverageGrade(List<Student> studentList){
        return studentList.stream()
                .map(student -> student.getGrade())
                .reduce((a,b) -> a+b).get()
                .doubleValue()/studentList.size();
    }

    public static List<Student> generateStudents(int amount){
        List<Student> studentList = new ArrayList<>();
        for (int i =0; i<amount;i++){
            Student student = new Student("Student " +(i+1),"Surname " +(i+1));
            studentList.add(student);
        }
        return studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                '}';
    }
}
