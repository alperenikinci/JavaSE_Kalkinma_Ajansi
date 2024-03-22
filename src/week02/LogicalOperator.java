package week02;

public class LogicalOperator {
    public static void main(String[] args) {
        String username = "alperenikinci";
        int password = 123456789;
        String str1= "Alperen";
        String str2= "Alperen";

//        System.out.println(str1==str2);
//
//        String str3= new String("Alperen");
//        String str4= new String("Alperen");

//        System.out.println(str3.equals(str4));

        System.out.println(username.equals("alperenikinci"));
        System.out.println(username.equals("alperikinci"));
        System.out.println(password == 123456789);
        System.out.println(password == 123456);
//
//        if(username.equals(new String("ALPERENİKİNCİ").toLowerCase()) && password==123456789){
//            System.out.println("Giriş başarılı");
//        }

        if(username.toUpperCase().equals(new String("ALPERENİKİNCİ")) && password==123456789){
            System.out.println("Giriş başarılı");
        }
        int character = 'A';
        char character2 = 'a';

        System.out.println(character + "\t"+character2);
    }
}
