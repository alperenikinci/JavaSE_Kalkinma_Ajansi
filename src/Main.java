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
        customerAddress.addressList.add(address);
        customerAddress.customerList.add(customer);
        customerAddress.customerList.add(customer2);
        Customer_Address customerAddress1 = new Customer_Address();
        customerAddress1.addressList.add(address2);
        customerAddress1.customerList.add(customer);
        System.out.println("Customer_Address_ID " +customerAddress1.id+
                "\nCustomers : "+ customerAddress1.customerList+
                "\nAddresses : "+ customerAddress1.addressList
        );


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
        List<Customer> customerList = new ArrayList<>();
        List<Address> addressList = new ArrayList<>();

        @Override
        public String toString() {
            return "Customer_Address{" +
                    "id=" + id +
                    ", customerList=" + customerList +
                    ", addressList=" + addressList +
                    '}';
        }
    }
}
