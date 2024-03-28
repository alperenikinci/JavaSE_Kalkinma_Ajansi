package week03.constructor;

//Bu sınıfın içerisinde isim, soyisim ve ülke fieldları olsun. Ülke fieldını içeriden atayan
//bir parametresiz constructor oluşturalım.
// Ülke değeri bir nesne oluşturulması durumunda direkt olarak "Türkiye" değerini alsın.
// Sonrasında bu sınıftan 3 adet nesne üretip, isim, soyisim bilgilerini doldurup, ülkelerinin
// Konsol çıktılarını alalım.
public class NoArgsConstructor {
    String name;
    String lastname;
    String county;

    private NoArgsConstructor(){
        county = "Turkey";
    }

    public static void main(String[] args) {
        NoArgsConstructor obj1 = new NoArgsConstructor();
        obj1.name = "Alperen";
        obj1.lastname= "İkinci";
        NoArgsConstructor obj2 = new NoArgsConstructor();
        obj2.name = "Meryem";
        obj2.lastname= "Alanoğlu";
        NoArgsConstructor obj3 = new NoArgsConstructor();
        obj3.name = "Berfin";
        obj3.lastname= "Menteş";

        System.out.println("Kişinin Adı : " + obj1.name);
        System.out.println("Kişinin Soyadı : " + obj1.lastname);
        System.out.println("Kişinin Ülkesi : " + obj1.county);
        System.out.println();
        System.out.println("Kişinin Adı : " + obj2.name);
        System.out.println("Kişinin Soyadı : " + obj2.lastname);
        System.out.println("Kişinin Ülkesi : " + obj2.county);
        System.out.println();
        System.out.println("Kişinin Adı : " + obj3.name);
        System.out.println("Kişinin Soyadı : " + obj3.lastname);
        System.out.println("Kişinin Ülkesi : " + obj3.county);
    }
}
