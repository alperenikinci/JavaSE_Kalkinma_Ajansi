package week05.function;

import java.util.function.Function;

public class FunctionTest03 {
    /*
        Encapsulation kurallarına uygun bir Employee sınıfı oluşturalım.
        Her bir Employee'nin ismi ve yaşı olsun.
        AllArgs constructor üretelim.
     */

    public static void main(String[] args) {
        Function<Employee,String> employeeToStringName = e -> e.getName();
        Employee emp = new Employee("Alperen",28);
        System.out.println(employeeToStringName.apply(emp));
    }
}
