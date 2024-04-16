package week05.supplier;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierTest06 {
    public static void main(String[] args) {
        Employee employee = findNameById(1L).orElseGet(
                () -> factory(
                        () -> new Employee(2L,"Muhammet",1979)
                )
        );
        System.out.println(employee.toString());
    }

    public static Employee factory (Supplier<? extends Employee> s){
        Employee employee = s.get();
        return employee;
    }

    public static Optional<Employee> findNameById(Long id){
        Employee employee;
        if (id ==1){
            employee = factory(()-> new Employee(1L,"Alperen",28));
        } else {
            employee = null;
        }
        return Optional.ofNullable(employee);
    }

}
