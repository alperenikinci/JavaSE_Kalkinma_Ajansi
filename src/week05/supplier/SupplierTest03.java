package week05.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Supplier;

//Supplier ile LocalDate kullanımı.
public class SupplierTest03 {
    public static void main(String[] args) {
        //Araştırma konusu : Java'da tarih formatları.
//        LocalDate date = LocalDate.now(); // YYYY/MM/DD
//        System.out.println(date);
//        LocalDate date2 = LocalDate.ofEpochDay(0);
//        System.out.println(date2);
//
//        long millis = 1713255055810l;
//        long second = 1713255055810l/1000l;
//        long minute = second/60;
//        long hour = minute/60;
//        long day = hour/24;
//        LocalDate date3 = LocalDate.ofEpochDay(day);
//        System.out.println(date3);
//
//        long birthDate;

        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());

        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        LocalDateTime localDateTime = supplier02.get();
        System.out.println(localDateTime);

        Supplier<String> supplier03 = ()-> dtf.format(LocalDateTime.now());
        String localDateTimeFormatter = supplier03.get();
        System.out.println(localDateTimeFormatter);
    }

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
}
