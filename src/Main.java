import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.name = "Alperen";
        Customer customer2 = new Customer();
        customer2.name = "Muhammet";
        Address address = new Address();
        address.content = "Ankara";
        Address address2 = new Address();
        address2.content = "Istanbul";

        Customer_Address customerAddress  = new Customer_Address();
        customerAddress.id = 1;
        customerAddress.address = address;
        customerAddress.customer = customer;
        Customer_Address customerAddress1 = new Customer_Address();
        customerAddress1.id = 2;
        customerAddress1.address = address;
        customerAddress1.customer = customer2;
        Customer_Address customerAddress2 = new Customer_Address();
        customerAddress2.id = 3;
        customerAddress2.address = address2;
        customerAddress2.customer = customer;
        System.out.println(customerAddress);
        System.out.println(customerAddress1);
        System.out.println(customerAddress2);


    }
    public static class Customer{
        public String name;
        public int customerAddressId;

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", customerAddressId=" + customerAddressId +
                    '}';
        }
    }
    public static class Address{
        public String content;
        public int customerAddressId;

        @Override
        public String toString() {
            return "Address{" +
                    "content='" + content + '\'' +
                    ", customerAddressId=" + customerAddressId +
                    '}';
        }
    }
    public static class Customer_Address{
        int id;
        Customer customer;
        Address address;

        @Override
        public String toString() {
            return "Customer_Address{" +
                    "id=" + id +
                    ", customer=" + customer +
                    ", address=" + address +
                    '}';
        }


    }
}
