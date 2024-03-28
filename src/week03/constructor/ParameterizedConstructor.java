package week03.constructor;

//Ad, soyad, yaş ve cinsiyet fieldlarını belirleyelim. Sonrasında bu sınıfın 2 adet nesnesini
//oluşturalım. Bu nesnelerin yaş ve cinsiyet değerleri, constructor parametresinden, oluşturma
//anında verilsin. Diğer 2 değeri elle girelim.
public class ParameterizedConstructor {
    String name;
    String lastname;
    int age;
    String gender;

    ParameterizedConstructor(int age, String gender){
        //isim cakismasi olacagi icin "this." anahtar kelimesini
        //kullanarak sinifimin field'ı olan age'e erisecegimi belirtiyorum.
        this.age = age;
        this.gender= gender;
    }
//    ParameterizedConstructor(){
//    }

    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor(28,"Erkek");
        obj1.name = "Alperen";
        obj1.lastname = "İkinci";
        System.out.println(obj1.name +
                " "+ obj1.lastname+
                " "+ obj1.gender+
                " "+ obj1.age);

//        ParameterizedConstructor obj2 = new ParameterizedConstructor();
//        System.out.println(obj2.gender+ " " + obj2.age);
    }
}
