package week05.stream.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    /**
     * 1- Student sınıfı oluşturalım. -> name, surname, grade;
     *  1.1 - > Encapsulated.
     * 2- Main sınıfında girilen sayı kadar student nesnesi üreten bir metot yazalım.
     * (grade kısmı 0-100 aralığında rastgele değer alsın.)
     * 3- Daha sonra öğrencilerin not ortalamasını hesaplayıp dönen bir stream yazalım.
     * 4- Notu 50'den düşük olan öğrencileri liste olarak dönen bir stream.
     * 5- Öğrencilerin isimleri ve öğrencilerin notlarını yazdıran bir stream.
     * 6- Öğrencilerin isimleri ve öğrencilerin notlarını bir collection yapısına toplayalım.
     */

    public static void main(String[] args) {
       List<Student> studentList =  Student.generateStudents(30);
       Double averageGrade = Student.calculateAverageGrade(studentList);
       List<Student> studentsBellowBound = studentList.stream()
                       .filter(x-> x.getGrade()<50).collect(Collectors.toList());
        System.out.println(averageGrade);
        studentsBellowBound.forEach(System.out::println);
        studentList.forEach(x-> System.out.println(x.getName() + " " + x.getGrade()));

        Map<String,Integer> studentsAndGrades = new HashMap<>();
        studentsAndGrades = studentList.stream()
                .collect(Collectors.toMap( k -> k.getName(), Student::getGrade));

        studentsAndGrades.entrySet()
                .forEach( entry -> System.out.println(
                        "Ogrenci Adı : " + entry.getKey()+
                        "\nOgrenci Notu : " + entry.getValue()+"\n"
                ));
    }
}
