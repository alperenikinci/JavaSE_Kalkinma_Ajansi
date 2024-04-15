package week05.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest04 {
    /*
        bir Product sınıfı oluşturalım. isim ve fiyatı olsun.
        AllArgsConstructor'ı olsun.
        Encapsulation kurallarına uygun bir şekilde hazırlayalım.
     */
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop",40000.0));
        productList.add(new Product("Phone",80000.0));
        productList.add(new Product("Tablet",50000D));

        // Consumer kullanarak her bir ürünün adını ve fiyatını yazdıralım.

        Consumer<Product> consumer = p -> {
            System.out.println("Name: "+ p.getName() + "\nPrice : " + p.getPrice());
        };

        productList.forEach(consumer);
    }
}
